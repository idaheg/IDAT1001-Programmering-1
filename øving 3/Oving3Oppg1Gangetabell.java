import java.util.Scanner;
public class Oving3Oppg1Gangetabell{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        //henter inn start- og sluttverdi fra bruker
        System.out.println("Skriv inn tallet for gangetabellen du vil starte med: ");
        int startverdi = in.nextInt();
        System.out.println("Skriv inn tallet for gangetabellen du vil slutte med: ");
        int sluttverdi = in.nextInt();

        //for-løkke som kjører fra start- til sluttverdi
        for (int i = startverdi; i <= sluttverdi; i++) {
            System.out.println(i + "-gangen:"); //skriver ut overskrift

            //ganger tallet i med alle tall fra 1-10
            for (int j = 1; j <= 10; j++) {
                System.out.println("\n" + i + " x " + j + " = " + i * j);
            }

            System.out.println("\n"); //mellomrom etter siste linje i tabellen
        }
    }
}