import static javax.swing.JOptionPane.*;

public class Client {
    public static void main(String[] args) {
        HearingaidCentral ntnu = new HearingaidCentral("NTNU-sentralen");

        ntnu.regHearingaid(1001, "Høreapparat");
        ntnu.regHearingaid(1002, "Høreapparat");
        ntnu.regHearingaid(1003, "Høreapparat");
        ntnu.regHearingaid(2001, "Samtaleforsterker");
        ntnu.regHearingaid(2002, "Samtaleforsterker");
        ntnu.regHearingaid(2003, "Samtaleforsterker");
        ntnu.regHearingaid(3001, "Varslingsutstyr");
        ntnu.regHearingaid(3002, "Varslingsutstyr");
        ntnu.regHearingaid(3003, "Varslingsutstyr");

        ntnu.regRent(1001, "Per Olsen");
        ntnu.regRent(2001, "Per Olsen");
        ntnu.regRent(3001, "Per Olsen");

        String[] muligheter = {"List all informasjon", "Registrer nytt hjelpemiddel", "Registrer Utlån", "Registrer innlevering", "Avslutt"};
        String[] valg1 = {"Ja", "Nei"};

        final int LIST_ALLE = 0;
        final int REGISTRER_NYTT_HJELPEMIDDEL = 1;
        final int UTLEVERING_AV_HJELPEMIDDEL = 2;
        final int INNLEVERING_AV_HJELPEMIDDEL = 3;
        final int AVSLUTT = 4;

        int valg = showOptionDialog(null,
                "Hjelpemiddelsentralen " + ntnu.getName() + "\nVelg funksjon",
                "Eksamen des 2019", YES_NO_OPTION, INFORMATION_MESSAGE,
                null, muligheter, muligheter[0]);

        while (valg != AVSLUTT) {
            switch (valg) {
                case LIST_ALLE:
                    showMessageDialog(null, ntnu.toString());
                    break;
                case REGISTRER_NYTT_HJELPEMIDDEL:
                    String idLest = showInputDialog(null, "Skriv inn hjelpemiddelets ID:");
                    int id = Integer.parseInt(idLest);
                    String type = showInputDialog(null, "Skriv inn hjelpemiddelets type:");
                    /*int jaNei = showConfirmDialog(null, "Vil du registrere en leietaker til dette hjelpemiddelet", null, YES_NO_OPTION);
                    if (jaNei == YES_OPTION) {
                        String leietaker = showInputDialog(null, "Skriv inn leietakers navn.");
                        ntnu.regHearingaid()
                    }*/
                    if (ntnu.regHearingaid(id, type)) {
                        showMessageDialog(null, "Hjelpemiddelet ble registrert");
                    }
                    else {
                        showMessageDialog(null, "Hjelpemiddelet ble ikke registrert, prøv igjen");
                    }
                    break;
                case UTLEVERING_AV_HJELPEMIDDEL:
                    String IDPaaApparat = showInputDialog("Hvilken ID har apparatet du ønsker å registere?");
                    int IDPaaApparatLest = Integer.parseInt(IDPaaApparat);
                    String navnPaaUtleier = showInputDialog("Hva er navnet på den nye utleieren?");
                    //Sjekker om utleien ble registert
                    if(ntnu.regRent(IDPaaApparatLest, navnPaaUtleier)){
                        showMessageDialog(null, "Leien av utstyr ble registert");
                    }
                    else{
                        showMessageDialog(null, "Apparatet du prøvde å leie er enten allerede utleid eller ikke-eksisterende");
                    }
                    break;
                case INNLEVERING_AV_HJELPEMIDDEL:
                    String IDPaaApparatet = showInputDialog("Hvilken ID har apparatet du ønsker å avslutte leien på?");
                    int IDPaaApparatetLest = Integer.parseInt(IDPaaApparatet);
                    //Sjekker om avslutningen av leie ble registert
                    if(ntnu.terminateRent(IDPaaApparatetLest)){
                        showMessageDialog(null, "Apparatet er ikke lenger leid");
                    }
                    else{
                        showMessageDialog(null, "Det skjedde en feil. Sjekk at ID er korrekt");
                    }
                    break;
                default:
                    showMessageDialog(null, "Unrecognized menu selected..");
                    break;
            }
            valg = showOptionDialog(null, "Hjelpemiddelsentralen " + ntnu.getName() + "\nVelg funksjon", "Eksamen des 2019", YES_NO_OPTION,INFORMATION_MESSAGE, null, muligheter, muligheter[0]);
        }
    }
}
