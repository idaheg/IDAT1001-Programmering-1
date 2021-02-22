//OPPGAVE 2a)
public class Lot{
    //objektvariabler
    private int municipalitynr;
    private String municipalityName;
    private final int LOTNR;
    private final int SECTIONNR;
    private String name;
    private double area;
    private String owner;

    //konstruktør
    public Lot(int municipalitynr, String municipalityName, int LOTNR, int SECTIONNR, String name, double area, String owner) {
        if (101 < municipalitynr && municipalitynr < 5054) {
            this.municipalitynr = municipalitynr;
            this.municipalityName = municipalityName;
            this.LOTNR = LOTNR;
            this.SECTIONNR = SECTIONNR;
            this.name = name;
            this.area = area;
            this.owner = owner;
        }
        else {
            throw new IllegalArgumentException("Kommunenummer må være mellom 101 og 5054");
        }
    }
    public Lot(int municipalitynr, String municipalityName, int LOTNR, int SECTIONNR, double area, String owner) {
        if (101 < municipalitynr && municipalitynr < 5054) {
            this.municipalitynr = municipalitynr;
            this.municipalityName = municipalityName;
            this.LOTNR = LOTNR;
            this.SECTIONNR = SECTIONNR;
            this.area = area;
            this.owner = owner;
        }
        else {
            throw new IllegalArgumentException("Kommunenummer må være mellom 101 og 5054");
        }
    }

    /**
     * Begrunnelse for valg av mutator-metoder:
     *
     * lager kun set-metoder til de som er naturlig at kan endres:
     * kommunen tomten hører til kan endres (eks kommunesammenslåing)
     * tomtnavnet kan endres
     * tomten kan utvides eller deles opp i flere tomter
     * tomten kan selges til ny eier
     * */

     int getMunicipalitynr() {
        return municipalitynr;
    }

    public void setMunicipalitynr(int municipalitynr) {
        this.municipalitynr = municipalitynr;
    }

    public String getMunicipalityName() {
        return municipalityName;
    }

    public void setMunicipalityName(String municipalityName) {
        this.municipalityName = municipalityName;
    }

    public int getLOTNR() {
        return LOTNR;
    }

    public int getSECTIONNR() {
        return SECTIONNR;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

//OPPGAVE 2b)
    public String findLotID() {
        return municipalitynr + "-" + LOTNR + "/" + SECTIONNR;
    }

    @Override
    public String toString() {
        return "Tomt " + findLotID() + ":" +
                "\nKommunenummer: " + municipalitynr +
                "\nGårdsnummer: " + LOTNR +
                "\nBruksnummer: " + SECTIONNR +
                "\nKommunenavn: " + municipalityName +
                "\nTomtenavn: " + name +
                "\nAreal i m2: " + area +
                "\nEier: " + owner;
    }

}
