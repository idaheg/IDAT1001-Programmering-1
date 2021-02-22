import java.util.ArrayList;
//OPPGAVE 3a)
public class LotRegister {
    /**
     * Begrunnelse for valg av ArrrayList;
     *
     * ArrayList har mange innebygde metoder for feks å fjerne/legge til og finne elementer. Disse metodene passer bra med metodene som er ønsket i klassen
     * Slipper å utvide listen, slik man må ved bruk av Array tabeller
     * Hvis en fjerner et element i listen, vil det ikke bli et "hull" i listen.
     * komfortabel med arraylist
     */
    private ArrayList<Lot> lots;

    public LotRegister() {
        this.lots = new ArrayList<Lot>();
    }

    //metode for å legge til eiendom
    public boolean addLot(Lot l) {
        if (!lots.contains(l)) {//sjekker om tomten er registrert allerede
            lots.add(l);
            return true;
        }
        return false;
    }
    /**
     * Sletter eiendom som samsvarer med kommunenr, gnr og bnr
     *
     * @param id
     *
     * @return true dersom tomten blir fjernet, false hvis tomten ikke finnes i registeret
     * */
    //metode for å fjerne eiendom
    public boolean removeLot(String id) {
        for (Lot lot:lots) {
            if (id.equals(lot.findLotID())) {
                lots.remove(lot);
                return true;
            }
        }
        return false;
    }
    /**
     * @return antall tomter i listen
     * */
    public int findNrOfLots() {
        return lots.size();
    }
    /**
     * Finner eiendom som samsvarer med kommunenr, gnr og bnr
     *
     * @param id
     *
     * @return tomten, hvis tomten ikke finnes returneres
     * */
    //metode for å finne tomt basert på kommunenr-gnr/brn
    public Lot findLot(String id) {
        for (Lot lot:lots) {
            if (id.equals(lot.findLotID())) {
                return lot;
            }
        }
        throw new IllegalArgumentException("Finner ikke tomten");
    }

//OPPGAVE 3b)
    /**
     * @return gjennomsnittsarealet av tomtene i listen
     * */
    //metode for å finne gjennomsnittsarealet av alle tomtene
    public double getMedianArea() {
        double totalArea = 0;
        for (Lot lot:lots) {
            totalArea += lot.getArea();
        }
        return totalArea / findNrOfLots();
    }

//OPPGAVE 3c)
    /**
     * Finner eiendom som har bestemt kommunenr
     *
     * @param municipalitynr
     * */
    //metode for å finne samtlige tomter med samme kommunenr
    public ArrayList<Lot> findLotsWithMunicipalitynr(int municipalitynr) {
        ArrayList<Lot> lotsWithNr = new ArrayList<>();
        for (Lot lot:lots) {
            if (lot.getMunicipalitynr() == municipalitynr) {
                lotsWithNr.add(lot);
            }
        }
        return lotsWithNr;
    }

    //skriver ut alle tomtene som er registrert
    @Override
    public String toString() {
        String string = "Tomter:";
        if (lots.isEmpty()) { //hvis det ikke er registrert noen tomter
            string = "Ingen tomter er registrert.";
        }
        else {
            for (Lot lot:lots) {
                string += "\n\n" + lot.toString();
            }
        }
        return string;
    }
}
