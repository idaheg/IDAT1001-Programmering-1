import java.util.ArrayList;

/**
 * Class that represents hearingaid-register.
 *
 * The class is a composite of Hearingaid. The multiplicity between
 * HearingaidCentral and Hearingaid is a "one to many", so both
 * composition and aggregation could be used. Hearingaid is however
 * mutable, in which case i think composition would be the best
 * alternative, in which you could coustomize it according to security.
 * I have also chosen composition because I don't see the need for
 * objects of the Hearingaid-class to exist outside of the
 * HearingaidCentral-context.
 *
 * Klasse som representerer hjelpemiddel-register.
 *
 * Klassen er en kompositt av Hearingaid. Multiplisiteten mellom
 * HearingaidCentral og Hearingaid er "en til mange", så både
 * komposisjon og aggregering kan bli brukt i denne oppgaven.
 * Klassen Hearingaid er mutabel, og jeg velger dermed å bruke
 * komposisjon da du kan tilpasse det som følge av sikkerhet.
 * Jeg valgt komposisjon pga at jeg ikke ser behovet for at
 * objekter av Hearingaid-klassen skulle brukes utenfor
 * HearingaidCentral-kontekstet.
 *
 *
 * Jeg har høy kohesjon på både klasse- og metode-nivå.
 * Hver av klassene representerer en entitet, og hver metode
 * har ansvar for en enkelt oppgave. Koden har også løs
 * kobling ettersom det er brukt dyp kopiering i en del av
 * metodene for høyere sikkerhet. Jeg har kun private felt i
 * mine klasser. Jeg har designet løsningen slik at klassene
 * trenger å vite minst mulig om hvordan klassene internt er
 * strukturert/oppbygget.
 */

public class HearingaidCentral {
    private String name;
    private ArrayList<Hearingaid> hearingaids;

    public HearingaidCentral(String name) {
        if (name == null || name.equals("")) {
            throw new IllegalArgumentException("Navn kan ikke være null eller tomt.");
        }
        this.name = name;
        this.hearingaids = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method registers a new hearingaid
     * @param id the id that identifies the hearingaid
     * @param type the type of hearingaid the object is
     * @return returns true if the registration was successful,
     * returns false if the id is outside of the valid interval
     * or if a hearingaid with the same id already exists.
     */
    public boolean regHearingaid(int id, String type) {
        Hearingaid newHearingaid = new Hearingaid(id, type);
        if (!hearingaids.contains(newHearingaid)) {
            hearingaids.add(newHearingaid);
            return true;
        }
        return false;
    }
    /**
     * This method registers rent
     * @param id the id that identifies the hearingaid
     * @param renterName the name of the person who wants to rent
     * @return returns true if the registration was successful,
     * returns false if the hearingaid is rented out already, or
     * if the hearingaid is not found.
     */
    public boolean regRent(int id, String renterName) {
        if(renterName == null || renterName.equals("")){
            throw new IllegalArgumentException("Du må registrere navnet ditt for å låne utstyret.");
        }
        for (Hearingaid h : hearingaids) {
            if (id == h.getID() && !h.isRented()) {
                h.setRented(true);
                h.setRenterName(renterName);
                return true;
            }
        }
        return false;
    }
    /**
     * This method registers a new hearingaid
     * @param id the id that identifies the hearingaid
     * @return returns true if the termination was successful,
     * returns false if the termination was unsuccessful.
     */
    public boolean terminateRent(int id) {
        for (Hearingaid h : hearingaids) {
            if (id == h.getID()) {
                h.setRented(false);
                h.setRenterName(null);
                return true;
            }
        }
        return false;
    }
    /**
     * This method lists all hearingaids
     * @return returns an arraylist of all hearingaids
     */
    public ArrayList<Hearingaid> listAllHearingaids() {
        //deep copy because of composition
        ArrayList<Hearingaid> hearingaidsCopy = new ArrayList<>();
        for (Hearingaid h : hearingaids) {
            hearingaidsCopy.add(new Hearingaid(h.getID(), h.getTYPE()));
        }
        return hearingaidsCopy;
    }
    /**
     * This method lists all free hearingaids of a certain type
     * @param type the type of hearingaids
     * @return returns arraylist of all hearingaids that were found given the arguments
     */
    public ArrayList<Hearingaid> listFreeHearingaidsOfType(String type) {
        ArrayList<Hearingaid> freeHearingaidsOfType = new ArrayList<>();
        for (Hearingaid h : hearingaids) {
            if (type.equals(h.getTYPE()) && !h.isRented()) {
                freeHearingaidsOfType.add(new Hearingaid(h.getID(), h.getTYPE()));
            }
        }
        return freeHearingaidsOfType;
    }

    @Override
    public String toString() {
        String text = "Name: " + name + "\nRegistered hearingaids:\n";
        for (Hearingaid h : hearingaids) {
            text += h.toString() + "\n";
        }
        return text;

    }
}
