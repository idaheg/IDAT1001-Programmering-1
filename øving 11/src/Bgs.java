import java.util.Scanner;

public class Bgs {
    // Constants representing the different menu choices
    private final int ADD_PROPERTY = 1;
    private final int LIST_ALL_PROPERTIES = 2;
    private final int FIND_PROPERTY = 3;
    private final int CALCULATE_AVERAGE_AREA = 4;
    private final int FIND_PROPERTIES_ON_LOT = 5;
    private final int REMOVE_PROPERTY = 6;
    private final int EXIT = 7;
    private LotRegister lr;

    public Bgs(LotRegister lr) {
        this.lr = lr;
    }

    private int showMenu() {

        int menuChoice = 0;

        System.out.println("\n***** Property Register Application v0.1 *****\n");
        System.out.println("1. Add property");
        System.out.println("2. List all properties");
        System.out.println("3. Search property");
        System.out.println("4. Calculate average area");
        System.out.println("5. Find properties on lot");
        System.out.println("6. Remove property");
        System.out.println("7. Quit");
        System.out.println("\nPlease enter a number between 1 and 7.\n");

        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()) {
            menuChoice = sc.nextInt();
        } else {
            System.out.println("You must enter a number, not text");
        }
        return menuChoice;
    }

    /**
     * Starts the application. This is the main loop of the application,
     * presenting the menu, retrieving the selected menu choice from the user, * and executing the selected functionality.
     */
    public void start() {
        boolean finished = false;
        Scanner sc = new Scanner(System.in);

        // The while-loop will run as long as the user has not selected // to quit the application
        while (!finished) {
            int menuChoice = this.showMenu();

            switch (menuChoice) {
                case ADD_PROPERTY:
                    System.out.println("Skriv inn kommunenr:");
                    int kom = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Skriv inn kommunenavn:");
                    String komnavn = sc.nextLine();
                    System.out.println("Skriv inn gårdsnr:");
                    int gnr = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Skriv inn bruksnr:");
                    int bnr = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Skriv inn tomtenavn (hvis tomten ikke har et navn trykk enter):");
                    String tomtnavn = sc.nextLine();
                    System.out.println("Skriv inn areal:");
                    double areal = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Skriv inn eier:");
                    String eier = sc.nextLine();
                    Lot lot = new Lot(1,"",1,1,"",1,"");
                    if (tomtnavn.equals("")) {
                        lot = new Lot(kom, komnavn, gnr, bnr, areal, eier);
                    }
                    else {
                        lot = new Lot(kom, komnavn, gnr, bnr, tomtnavn, areal, eier);
                    }

                    if (lr.addLot(lot)) {
                        System.out.println("Property successfully added");
                    }
                    else {
                        System.out.println("Property could not be added");
                    }
                    break;
                case LIST_ALL_PROPERTIES:
                    System.out.println(lr.toString());
                    break;
                case FIND_PROPERTY:
                    System.out.println("Skriv inn kommunenr-gnr/bnr:");
                    String id2 = sc.nextLine();

                    System.out.println(lr.findLot(id2));
                    break;
                case CALCULATE_AVERAGE_AREA:
                    System.out.println(lr.getMedianArea());
                    break;
                case FIND_PROPERTIES_ON_LOT:
                    break;
                case REMOVE_PROPERTY:
                    break;
                case EXIT:
                    System.out.println("Thank you for using the Properties app!\n");
                    finished = true;
                    break;
                default:
                    System.out.println("Unrecognized menu selected..");
                    break;
            }
        }
    }
}
