
import static javax.swing.JOptionPane.*; 
public class Oving1Oppg1TommerTilCm {
    public static void main(String[] args) {
        String tommerLest = showInputDialog("Tommer: ");
        double tommer = Double.parseDouble(tommerLest);
        double centi = tommer * 2.54 ;
        showMessageDialog(null, tommer + " tommer er " + centi + " centimeter."); 
    }
}