/*import java.util.Scanner;*/
import static javax.swing.JOptionPane.*; 
public class Oving2Oppg1Skuddaar {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Skriv inn årstall: ");*/

        String aarLest = showInputDialog("Skriv inn årstall: ");
        int aar = Integer.parseInt(aarLest);

        if(aar % 4 == 0){
            if(aar % 100 == 0){
                if(aar % 400 == 0){
                    showMessageDialog(null, aarLest + " er et skuddår.");
                }
                else{
                    showMessageDialog(null, aarLest + " er IKKE et skuddår.");
                }
            }
            else{
                showMessageDialog(null, aarLest + " er et skuddår.");
            }
        }
        else{
            showMessageDialog(null, aarLest + " er IKKE et skuddår.");
        }
    }
}