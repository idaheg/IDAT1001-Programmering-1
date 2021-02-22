import java.time.LocalDate;
import java.util.Objects;

/**
 * KLasse som representerer korona-registrering
 *
 * @author 10024
 */
public class CoronaRegistration {
    private final LocalDate DATE;
    private final String COUNTRY;
    private int infected;
    private int deaths;

    /**
     * Konstruktør som oppretter et objekt av CoronaRegistration.
     *
     * @param COUNTRY
     * @param infected
     * @param deaths
     */
    public CoronaRegistration(LocalDate DATE, String COUNTRY, int infected, int deaths) {
        if (DATE == null || COUNTRY == null || COUNTRY.equals("")) {
            throw new IllegalArgumentException("Dato og land må være fylt inn.");
        }
        this.DATE = DATE;
        this.COUNTRY = COUNTRY;
        this.infected = infected;
        this.deaths = deaths;
    }
    /**
     *
     * @return date
     */
    public LocalDate getDate() {
        return DATE;
    }
    /**
     *
     * @return country
     */
    public String getCountry() {
        return COUNTRY;
    }
    /**
     *
     * @return infected
     */
    public int getInfected() {
        return infected;
    }
    /**
     *
     * @param infected
     */
    public void setInfected(int infected) {
        this.infected = infected;
    }
    /**
     *
     * @return deaths
     */
    public int getDeaths() {
        return deaths;
    }
    /**
     *
     * @param deaths
     */
    public void setDeaths(int deaths) {
        this.deaths = deaths;
    }
    /**
     *
     * @return true hvis datoene er like, false hvis ikke
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CoronaRegistration that = (CoronaRegistration) o;
        return DATE.equals(that.DATE) &&
                COUNTRY.equals(that.COUNTRY);
    }

    /**
     *
     * @return tekststreng
     */
    @Override
    public String toString() {
        return DATE.toString() + " | " + COUNTRY.toUpperCase() + " | infected: " + infected + " | dead: " + deaths;
    }
}
