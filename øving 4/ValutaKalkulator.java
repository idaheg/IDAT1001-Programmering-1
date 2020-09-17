import java.util.Scanner;

public class ValutaKalkulator{
    public static void main(String[] args) {
        Valuta usd = new Valuta("USD", 8.93);
        Valuta eur = new Valuta("EUR", 10.58);
        Valuta sek = new Valuta("SEK", 1.02);
        
        Scanner input = new Scanner(System.in);
        

        boolean fortsett = true;

        while (fortsett) {
            System.out.println("Velg valuta du vil fra: \n 1: USD \n 2: EUR \n 3: SEK \n 4: Avslutt");
            int choice = input.nextInt();
            
            double penger = 0;

            switch (choice) {
            case 1:
                System.out.println(usd.toString());
                penger = input.nextDouble();
                double konvertert = usd.convertToNOK(penger);
                System.out.println(penger + " USD, er det samme som " + konvertert + " NOK.");
                break;
            case 2:
                System.out.println(eur.toString());
                penger = input.nextDouble();
                konvertert = eur.convertToNOK(penger);
                System.out.println(penger + " EUR, er det samme som " + konvertert + " NOK.");
                break;
            case 3:
                System.out.println(sek.toString());
                penger = input.nextDouble();
                konvertert = sek.convertToNOK(penger);
                System.out.println(penger + " SEK, er det samme som " + konvertert + " NOK.");
                break;
            case 4:
                fortsett = false;
                break;
            default:
                System.out.println("Ikke et gyldig valg.");
            }
        }//input.close();
        
    } 
}