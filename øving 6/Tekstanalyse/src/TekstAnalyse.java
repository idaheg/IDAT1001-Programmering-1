public class TekstAnalyse {
    private String tekst;
    private int[] antallTegn;

    public TekstAnalyse(String tekst, int antall) {
        this.tekst = tekst;
        this.antallTegn = new int[antall];
    }
    public int findNrLetters() {
        String test = "";
        for (int i = 0; i < tekst.length(); i++) {
            int counter = 0;
            if (tekst.charAt(i) == test) {
                counter++;
            }
        }
    }
}
public class Klientprogram {
    
}
