import java.util.Objects;

/**
 * Class that represents hearingaid.
 *
 * @author TODO: kandidatnr
 */

public class Hearingaid {
    private final int ID;
    private final String TYPE;
    private boolean rented;
    private String renterName;

    /**
     * Konstruktør som oppretter et objekt av Hjelpemiddel.
     * Ved opprettelse er ikke hjelpemidlet utleid til en person.
     *
     * @param ID
     * @param TYPE
     */
    public Hearingaid(int ID, String TYPE) {
        if (ID < 1001 || ID > 9999) {
            throw new IllegalArgumentException("The id must be from 1001-9999.");
        }
        this.ID = ID;
        this.TYPE = TYPE;
        this.rented = false;
        this.renterName = null;
    }
    public Hearingaid(int ID, String TYPE, String renterName) {
        if (ID < 1001 || ID > 9999) {
            throw new IllegalArgumentException("The id must be from 1001-9999.");
        }
        this.ID = ID;
        this.TYPE = TYPE;
        this.rented = true;
        this.renterName = renterName;
    }

    //id and type are immutable, and the objectvariables are therefore set to final, and correspondlinly only have get-methods. rented and renterName are mutable and have both get- and set-methods.
    //id og type er immutable og skal derfor ikke kunne endres. Objektvariablene er derfor til final, og har derved bare get-metoder. Rented og renterName er mutable og skal kunne endres, og har derfor både get- og set-metoder.
    /**
     *
     * @return ID
     */
    public int getID() {
        return ID;
    }
    /**
     *
     * @return TYPE
     */
    public String getTYPE() {
        return TYPE;
    }
    /**
     *
     * @return rented
     */
    public boolean isRented() {
        return rented;
    }
    /**
     *
     * @param rented
     */
    public void setRented(boolean rented) {
        this.rented = rented;
    }
    /**
     *
     * @return renterName
     */
    public String getRenterName() {
        return renterName;
    }
    /**
     *
     * @param  renterName
     */
    public void setRenterName(String renterName) {
        this.renterName = renterName;
    }
    /**
     * Metode som sammenligner to Hjelpemiddelobjekter.
     * Objektene er like dersom de har samme ID
     *
     * @param o
     * @return true hvis de har samme ID, false hvis ikke.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hearingaid that = (Hearingaid) o; //changes object o to a object of the Hearingaid-class.
        return ID == that.ID;
    }
    /**
     * Metode som returnerer informasjon om et hjelpemiddel på formen
     * ID type leiestatus.
     * Ekesempel på utskrift
     * Utleid: «3003 Varslingsutstyr utleid til Per Olsen»
     * Ikke utleid: «3003 Varslingsutstyr ledig»
     *
     * @return utskrift
     */
    @Override
    public String toString() {
        if (rented == true) {
            return ID + " " + TYPE + " is rented out to " + renterName;
        }
        else {
            return ID + " " + TYPE + " is available for rent";
        }
    }
}
