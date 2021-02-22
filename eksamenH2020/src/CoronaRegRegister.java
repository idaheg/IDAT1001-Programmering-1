import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * KLasse som representerer et register over korona-registreringer.
 *
 * Klassen er et aggregat av CoronaRegistration. Multiplisitet mellom
 * CoronaRegRegister og CoronaRegistration en "en til mange", så både
 * aggregering og komposisjonen ville passe like bra.
 * CoronaRegistration er mutabel, derfor må jeg tilpasse sikkerheten.
 * Jeg har derfor valgt å kopiere dypt.
 * Til slutt har jeg valgt aggregering pga at jeg ser behov for å
 * bruke CoronaRegistration objektene uavhengig av CoronaRegRegister.
 * Dessuten hvis registeret skulle slettes, vil jeg ikke at de
 * allerede registrerte CoronaRegistration skal forsvinne sammen med
 * registeret.
 *
 * @author 10024
 */
public class CoronaRegRegister {
    private ArrayList<CoronaRegistration> coronaRegistrations;

    /**
     * Konstruktør som oppretter en ArrayList av CoronaRegistration
     */
    public CoronaRegRegister() {
        this.coronaRegistrations = new ArrayList<>();
    }

    /**
     * Metode som registrerer ny statistikk (ny koronaregistrering)
     *
     * @param c
     * @return true hvis den blir registrert, false hvis ikke
     */
    public boolean regCoronaStats(CoronaRegistration c) {
        if (!coronaRegistrations.contains(c)) {
            coronaRegistrations.add(c);
            return true;
        }
        return false;
    }

    /**
     * Metode som returnerer en iterator som andre objekter kan benytte for å iterere over COVID-registreringene i registeret.
     *
     * @return iterator
     */
    public Iterator<CoronaRegistration> iterator() {
        Iterator<CoronaRegistration> iterator = coronaRegistrations.iterator();
        return iterator;
    }

    /**
     * Metode som lister alle elementene i registeret
     *
     * @return coronaRegistrationsCopy, liste over alle elementene i arraylisten
     */
    public ArrayList<CoronaRegistration> listAll() {
        ArrayList<CoronaRegistration> coronaRegistrationsCopy = new ArrayList<>();
        while (iterator().hasNext()) {
            CoronaRegistration c = iterator().next();
            coronaRegistrationsCopy.add(new CoronaRegistration(c.getDate(), c.getCountry(), c.getInfected(), c.getDeaths()));
        }
        return coronaRegistrationsCopy;
    }

    /**
     * Metode som lister et element i registeret på en spesifikk dato
     *
     * @param date
     * @return coronaRegistrationsCopy, første elementet som fantes i arraylisten med det gitte argumentet
     */
    //tolker oppgaven slik at kun et element skal returneres i denne metoden, eksempel på hvordan det ville blitt gjort hvis man listet alle registreringene på gitt dato, kommentert ut under
    public CoronaRegistration listOnDate(String date) {
        CoronaRegistration coronaRegistrationCopy = null;
        while (iterator().hasNext()) {
            CoronaRegistration c = iterator().next();
            if (c.getDate().equals(LocalDate.parse(date))) {
                coronaRegistrationCopy = new CoronaRegistration(c.getDate(), c.getCountry(), c.getInfected(), c.getDeaths());
            }
        }
        return coronaRegistrationCopy;
    }

    /*
    public ArrayList<CoronaRegistration> listAllOnDate(String date) {
        ArrayList<CoronaRegistration> coronaRegistrationsCopy = new ArrayList<>();
        while (iterator().hasNext()) {
            CoronaRegistration c = iterator().next();
            if (c.getDate().equals(LocalDate.parse(date))) {
                coronaRegistrationsCopy.add(new CoronaRegistration(c.getDate(), c.getCountry(), c.getInfected(), c.getDeaths()));
            }
        }
        return coronaRegistrationsCopy;
    }
     */

    /**
     * Metode som lister alle elementene i registeret som er etter en spesifikk dato
     *
     * @param date
     * @return coronaRegistrationsCopy, liste over elementene som fantes i arraylisten med det gitte argumentet
     */
    public ArrayList<CoronaRegistration> listAllAfterDate(String date) {
        ArrayList<CoronaRegistration> listAfterDate = new ArrayList<>();
        while (iterator().hasNext()) {
            CoronaRegistration c = iterator().next();
            if (c.getDate().isAfter(LocalDate.parse(date))) {
                listAfterDate.add(new CoronaRegistration(c.getDate(), c.getCountry(), c.getInfected(), c.getDeaths()));
            }
        }
        return listAfterDate;
    }

    /**
     * Metode som finner totalt antall døde fra et spesifikt land
     *
     * @param country
     * @return counter, antall døde
     */
    public int findTotalNumDeaths(String country) {
        int counter = 0;
        while (iterator().hasNext()) {
            CoronaRegistration c = iterator().next();
            if (c.getCountry().equalsIgnoreCase(country)) {
                counter += c.getDeaths();
            }
        }
        return counter;
    }

    /**
     * Metode for å returnere antallet COVID-19 registreringer i registeret.
     *
     * @return størrelsen på coronaRegistrations
     */
    public int findNumOfReg() {
        return coronaRegistrations.size();
    }

    /**
     *
     * @return tekststreng
     */
    @Override
    public String toString() {
        String text = "Covid-19 registrations:";
        while (iterator().hasNext()) {
            CoronaRegistration c = iterator().next();
            text += "\n" + c.toString();
        }
        return text;
    }
}
