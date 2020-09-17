public class KlientprogTerning {
    public static void main(String[] args) {
        Terning a = new Terning(0, 0);
        Terning b = new Terning(0, 0);

        while (!a.erFerdig() && !b.erFerdig()) {
            a.kastTerningen();
            b.kastTerningen();
            System.out.println("Terning A:\nAntall kast: " + a.getAntKast() + "\nSum poeng: " + a.getSumPoeng() + "\nTerning B:\nAntall kast: " + a.getAntKast() + "\nSum poeng: " + b.getSumPoeng());
        }
        if (a.getSumPoeng() >= 100) {
            System.out.println("A vant.");
        } else  {
            System.out.println("B vant.");
        }
    }
}
