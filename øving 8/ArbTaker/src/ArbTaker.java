public class ArbTaker {
    private final Person personalia;
    private final int arbTakerNr;
    private final int ansettelsesAar;
    private double maanedslonn;
    private double skatteprosent;

    private java.util.GregorianCalendar kalender = new java.util.GregorianCalendar();
    private int aar = kalender.get(java.util.Calendar.YEAR);

    public ArbTaker(Person personalia, int arbTakerNr, int ansettelsesAar, double maanedslonn, double skatteprosent) {
        this.personalia = personalia;
        this.arbTakerNr = arbTakerNr;
        this.ansettelsesAar = ansettelsesAar;
        this.maanedslonn = maanedslonn;
        this.skatteprosent = skatteprosent;
    }

    //get-metoder
    public Person getPersonalia() {
        return personalia;
    }

    public int getArbTakerNr() {
        return arbTakerNr;
    }

    public int getAnsettelsesAar() {
        return ansettelsesAar;
    }

    public double getMaanedslonn() {
        return maanedslonn;
    }

    public double getSkatteprosent() {
        return skatteprosent;
    }

    //set-metoder
    public void setMaanedslonn(double nyLonn) {
        maanedslonn = nyLonn;
    }

    public void setSkatteprosent(double nyProsent) {
        skatteprosent = nyProsent;
    }

    //finner antall kroner arbeidstaker skatter per mnd
    public double skattekrPerMnd() {
        return maanedslonn * skatteprosent / 100;
    }

    //finner bruttolønn per år
    public double bruttolonnPerAar() {
        return maanedslonn * 12;
    }

    //finner skattetrekk per år
    public double skattetrekkPerAar() {
        return (skattekrPerMnd() * 10) + (skattekrPerMnd() / 2);
    }

    public String finnNavn() {
        return personalia.getEtternavn() + ", " + personalia.getFornavn();
    }

    public int finnAlder() {
        return aar - personalia.getFodselsaar();
    }

    public int finnAntAar() {
        return aar - ansettelsesAar;
    }

    public boolean finnGittAntAar(int antAar) {
        return finnAntAar() >= antAar;
    }

    public String toString() {
        return finnNavn() + " har fått ny månedslønn kr " + getMaanedslonn() + " og skatter " + getSkatteprosent() + "%.";
    }
}
