import static javax.swing.JOptionPane.*; 
public class KlientprogBroker {
    public static void main(String[]args){
        String tellerLest = showInputDialog("Skriv inn teller til den første brøken");
        int teller1 = Integer.parseInt(tellerLest);
        String nevnerLest = showInputDialog("Skriv inn nevner til den første brøken");
        int nevner1 = Integer.parseInt(nevnerLest);
        Broker brok1 = new Broker(teller1, nevner1);

        tellerLest = showInputDialog("Skriv inn teller til den andre brøken");
        int teller2 = Integer.parseInt(tellerLest);
        nevnerLest = showInputDialog("Skriv inn nevner til den andre brøken");
        int nevner2 = Integer.parseInt(nevnerLest);

        String valgLest = showInputDialog("Velg hva du vil gjøre:\n1: summere\n2: subtrahere\n3: multiplisere\n4: divdere");
        int valg = Integer.parseInt(valgLest);

        switch (valg) {
            case 1:
                brok1.sum(teller2, nevner2);
                showMessageDialog(null, brok1.toString());
                break;
            case 2:
                brok1.sub(teller2, nevner2);
                showMessageDialog(null, brok1.toString());
                break;
            case 3:
                brok1.multi(teller2, nevner2);
                showMessageDialog(null, brok1.toString());
                break;
            case 4:
                brok1.div(teller2, nevner2);
                showMessageDialog(null, brok1.toString());
                break;
            default:
                System.out.println("Ikke et gyldig valg.");
        }
    }
}
