
import static javax.swing.JOptionPane.*; 
public class Oving1Oppg3SekTilTid {
    public static void main(String[] args) {
        String sekLest = showInputDialog("Sekunder: ");
        double sek = Double.parseDouble(sekLest);
        int verdi = (int)sek;

        int timer = verdi/3600;
        int finnMin = verdi%3600;

        int min = finnMin/60;
        int finnSek = finnMin%60;

        int sek2 = finnSek%60;

        showMessageDialog(null, sek + " sekunder blir " + timer + " timer, " + min + " minutter og " + sek2 + " sekunder."); 
    }
}