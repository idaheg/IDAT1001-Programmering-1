import static javax.swing.JOptionPane.*; 
public class Oving3Oppg2Primtall{
    public static void main(String[] args) {
        int choice;

	    do {
        String lesTall = showInputDialog("Skriv inn et tall: ");
        double tall = Double.parseDouble(lesTall);
        boolean primtall = false;
        
        for (int i = 1; i <= tall; i++) {
            if(tall % i == 0 && i != 1 && i != tall) {
                primtall = false;
                break; //går ut av for-løkken hvis argumentet er oppfylt
            }
            else {
                primtall = true;
            }
        }
		if (primtall == true) {
            showMessageDialog(null, lesTall + " er et primtall");
        } else {
            showMessageDialog(null, lesTall + " er IKKE et primtall");
        }
        
        choice = showConfirmDialog(null, "Ønsker du å fortsette programmet?", "Primtall", YES_NO_OPTION);  
        } while (choice == YES_OPTION);
    }
}