public class NyString {
    private final String nyString;

    public NyString(String tekst) {
        nyString = tekst;
    }
    public String getNyString() {
        return nyString;
    }
    public String forkort() {
        String[] ord = nyString.split(" ");
        String kort = new String();
        for (int i = 0; i < ord.length; i++) {
            kort += (ord[i].charAt(0));
        }
        return kort;
    }
    public String fjernTegn(String tegn) {
        String[] ord = nyString.split(tegn);
        String setn = new String();
        for (int i = 0; i < ord.length; i++) {
            setn += ord[i];
        }
        return setn;
    }
}
