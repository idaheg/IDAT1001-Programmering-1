import java.time.LocalDate;
import static javax.swing.JOptionPane.*;

public class Main {

    public static void main(String[] args) {
        CoronaRegRegister covidStatsUI = new CoronaRegRegister();
        covidStatsUI.regCoronaStats(new CoronaRegistration(LocalDate.parse("2020-01-19"), "CHINA", 136, 1));
        covidStatsUI.regCoronaStats(new CoronaRegistration(LocalDate.parse("2020-02-05"), "CHINA", 3872, 66));
        covidStatsUI.regCoronaStats(new CoronaRegistration(LocalDate.parse("2020-03-07"), "NORGE", 3, 0));
        covidStatsUI.regCoronaStats(new CoronaRegistration(LocalDate.parse("2020-03-09"), "USA", 259, 4));
        covidStatsUI.regCoronaStats(new CoronaRegistration(LocalDate.parse("2020-03-09"), "CHINA", 45, 23));
        covidStatsUI.regCoronaStats(new CoronaRegistration(LocalDate.parse("2020-03-22"), "NORGE", 240, 8));
        covidStatsUI.regCoronaStats(new CoronaRegistration(LocalDate.parse("2020-03-24"), "USA", 20341, 119));
        covidStatsUI.regCoronaStats(new CoronaRegistration(LocalDate.parse("2020-03-25"), "CHINA", 28, 4));
        covidStatsUI.regCoronaStats(new CoronaRegistration(LocalDate.parse("2020-04-06"), "NORGE", 110, 3));
        covidStatsUI.regCoronaStats(new CoronaRegistration(LocalDate.parse("2020-04-10"), "USA", 30859, 2087));
        covidStatsUI.regCoronaStats(new CoronaRegistration(LocalDate.parse("2020-04-10"), "CHINA", 55, 1));

        String[] menuItems = {"Add a COVID-19 entry", "List all COVID-19 entries in the register", "Find COVID-19 entry by date", "Find all entries after date", "Show the total deaths for a country", "Exit"};
        final int ADD_COVID_ENTRY_TO_REGISTER = 0;
        final int LIST_ALL_COVID_ENTRIES = 1;
        final int FIND_COVID_ENTRY_BY_DATE = 2;
        final int FIND_COVID_ENTRY_AFTER_DATE = 3;
        final int CALCULATE_TOTAL_DEATHS = 4;
        final int EXIT = 5;

        int menuSelection = showOptionDialog(null, "COVID-19 \nSelect", "Exam des 2020", YES_NO_OPTION, INFORMATION_MESSAGE, null, menuItems, menuItems[0]);
        while (menuSelection != EXIT) {
            switch (menuSelection) {
                case ADD_COVID_ENTRY_TO_REGISTER:
                    //går ut fra at alle nye registreringer foregår på dagen for statistikken
                    LocalDate date = LocalDate.now();
                    String country = showInputDialog(null, "Name of country:");
                    String infectedRead = showInputDialog(null, "Number of infected:");
                    int infected = Integer.parseInt(infectedRead);
                    String deathsRead = showInputDialog(null, "Number of deaths:");
                    int deaths = Integer.parseInt(deathsRead);
                    boolean test = covidStatsUI.regCoronaStats(new CoronaRegistration(date, country, infected, deaths));
                    if (test) {
                        showMessageDialog(null, "The registration was successful");
                    }
                    else {
                        showMessageDialog(null, "The registration was not successful, please try again");
                    }
                    break;
                case LIST_ALL_COVID_ENTRIES:
                    //showMessageDialog(null, covidStatsUI.listAll().toString());
                    System.out.println(covidStatsUI.listAll().toString());
                    break;
                case FIND_COVID_ENTRY_BY_DATE:
                    String date1 = showInputDialog(null, "Date(YYYY-MM-DD):");
                    showMessageDialog(null, covidStatsUI.listOnDate(date1).toString());
                    break;
                case FIND_COVID_ENTRY_AFTER_DATE:
                    String date2 = showInputDialog(null, "Date(YYYY-MM-DD):");
                    showMessageDialog(null, covidStatsUI.listAllAfterDate(date2).toString());
                    break;
                case CALCULATE_TOTAL_DEATHS:
                    String country1 = showInputDialog(null, "Country:");
                    showMessageDialog(null, country1.toUpperCase() + " has " + covidStatsUI.findTotalNumDeaths(country1) + " dead from Covid-19");
                    break;
                default:
                    break;
            }
            menuSelection = showOptionDialog(null, "COVID-19 \nSelect", "Exam des 2020", YES_NO_OPTION, INFORMATION_MESSAGE, null, menuItems, menuItems[0]);
        }
    }
}
