
import static javax.swing.JOptionPane.*; 
public class Oving1Oppg2TidTilSek {
    public static void main(String[] args) {
        String timerLest = showInputDialog("Timer: ");
        String minLest = showInputDialog("Minutter: ");
        String sekLest = showInputDialog("Sekunder: ");

        double timer = Double.parseDouble(timerLest);
        double min = Double.parseDouble(minLest);
        double sek = Double.parseDouble(sekLest);

        double sekResultat = (timer * 3600)+(min*60)+sek ;
        showMessageDialog(null, sekResultat + " sekunder."); 
    }
}