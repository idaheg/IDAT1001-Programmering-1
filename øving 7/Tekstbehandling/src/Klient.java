public class Klient {
    public static void main(String[] args) {
        Tekstbehandling tekst = new Tekstbehandling("Dette er en setning. Dette er også en setning! Hei hallo? heihei.");

        System.out.println(tekst.getTekst());
        System.out.println("Antall ord i teksten: " + tekst.antOrd());
        System.out.println("Gjennomsnittlig antall bokstaver i ordene: " + tekst.gjennomsnittOrd());
        System.out.println(tekst.storeBokstaver());
        System.out.println("Gjennomsnittlig antall ord per periode: " + tekst.ordPerPeriode());
        System.out.println(tekst.endreOrd("en", "ei"));
    }
}
