/*import java.util.Scanner;

public class Menu {
    // Constants representing the different menu choices
    private final int ADD_HEARING_AID = 1;
    private final int LIST_ALL_HEARING_AIDS = 2;
    private final int TERMINATE_RENT = 3;
    private final int LIST_FREE_HEARING_AIDS_OF_TYPE = 4;
    private final int EXIT = 5;

    /**
     * Presents the menu for the user, and awaits input from the user. The menu
     * choice selected by the user is being returned. *
     * @return the menu choice by the user as a positive number starting from 1.
     * If 0 is returned, the user has entered a wrong value private
     *
    int showMenu() {
        int menuChoice = 0;
        System.out.println("\n***** Hearing Aid Central v0.1 *****\n");
        System.out.println("1. Add hearing aid");
        System.out.println("2. List all hearing aids");

        //TODO: Add more menus

        System.out.println("9. Quit"); // Or another number than 9 System.out.println("\nPlease select from the menu.\n");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            menuChoice = sc.nextInt();
        }
        else {
            System.out.println("You must enter a number, not text");
        }
        return menuChoice;
    }
    /**
     * Starts the application. This is the main loop of the application,
     * presenting the menu, retrieving the selected menu choice from the user, * and executing the selected functionality.
     *
    public void start() {
        Scanner sc = new Scanner(System.in);
        boolean finished = false; //The while-loop will run as long as the user has not selected
        // to quit the application
        while (!finished) {
            int menuChoice = this.showMenu();
            switch (menuChoice) {
                case ADD_HEARING_AID:
                    System.out.println("Write hearingaid ID:");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Write hearingaid type");
                    sc.nextLine();
                    System.out.println("Do you want to register a renter for this hearingaid?");

                    break;
                case LIST_ALL_HEARING_AIDS:

                    break;
                case TERMINATE_RENT:
                    //TODO: Fill inn your code here....
                    break;
                case LIST_FREE_HEARING_AIDS_OF_TYPE:
                    //TODO: Fill inn your code here....
                    break;
                case EXIT:
                    System.out.println("Thank you for using the Hearingaid app!\n");
                    finished = true;
                    break;
                default:
                    System.out.println("Unrecognized menu selected..");
                    break;
            } }
    }

}*/
