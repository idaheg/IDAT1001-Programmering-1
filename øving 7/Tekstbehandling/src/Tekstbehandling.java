public class Tekstbehandling {
    private String tekst;

    //konstruktøren
    public Tekstbehandling(String tekst) {
        this.tekst = tekst;
    }
    //get-metode
    public String getTekst() {
        return tekst;
    }
    //finner antall ord i teksten
    public int antOrd() {
        return tekst.split(" ").length;
    }
    //finner gjennomsnittlig antall bokstaver per ord.
    public double gjennomsnittOrd() {
        int sum = 0;
        String[] ord = tekst.split(" ");
        for (int i = 0; i < ord.length; i++) {
            sum += ord[i].length();
        }
        return (float)sum/ord.length;
    }
    //finner gjennomsnittlig antall ord per periode (deles ved ., :, !, ?)
    public double ordPerPeriode() {
        String[] setn = tekst.split("[\\\\.:!?]");
        int tell = 0;
        for (int i = 0; i < setn.length; i++) {
            String[] delt = setn[i].split(" ");
            tell += delt.length;
        }
        return (float)tell/setn.length;
    }
    //endrer et ord i teksten med et annet
    public String endreOrd(String gammeltOrd, String nyttOrd) {
        return tekst.replaceAll(gammeltOrd, nyttOrd);
    }
    //gjør hele teksten til store bokstaver
    public String storeBokstaver() {
        return tekst.toUpperCase();
    }
}
