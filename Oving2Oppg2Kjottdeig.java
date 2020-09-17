import java.util.Scanner;
public class Oving2Oppg2Kjottdeig{
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);*/

        double prisKjottA = (35.90/450)*1000;
        double prisKjottB = (39.50/500)*1000;
        
        if(prisKjottA > prisKjottB){
            System.out.println("Kjøttdeig B er billigere enn kjøttdeig A");
        }
        else{
            System.out.println("Kjøttdeig A er billigere enn kjøttdeig B");
        }
    }
}