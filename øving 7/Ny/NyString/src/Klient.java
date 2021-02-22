public class Klient {
    public static void main(String[] args) {
        NyString tekst = new NyString("denne setningen kan forkortes");
        String tegn = "e";

        System.out.println(tekst.forkort());
        System.out.println(tekst.fjernTegn(tegn));
    }
}
