import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class EventRegister {
    private ArrayList<Event> eventReg = new ArrayList<>();

    public EventRegister() {

    }

    //metode for å legge til arrangement
    public boolean addArr(Event a) {
        if (!eventReg.contains(a)) {
            eventReg.add(a);
            return true;
        }
        return false;
    }

    //finne alle arrangementer som foregår et sted
    public ArrayList<Event> getAllFromPlace(String place) {
        ArrayList<Event> findPlace = new ArrayList<>(); //lager ny arraylist som de funnede arrangementene kan legges i
        Iterator<Event> iterator = eventReg.iterator(); //iterator for å telle eventregisteret
        while (iterator.hasNext()) { //hvis eventregisteret har en neste
            Event a = iterator.next();
            if (a.getPlace().equals(place)) { //hvis stedet i arrangementet er lik det gitte stedet
                findPlace.add(a); //legg til arrangementet i den nye arraylisten
            }
        }
        if (findPlace.size() > 0) { //hvis det er funnet noen arrangementer
            return findPlace; //returner arraylisten
        } else {
            return null; // ingen funnet
        }
    }

    //finne alle arrangementer på en gitt dato
    public ArrayList<Event> getAllFromDate(int date) {
        ArrayList<Event> findDate = new ArrayList<>();
        Iterator<Event> iterator = eventReg.iterator();
        while (iterator.hasNext()) {
            Event a = iterator.next();
            int arrDate = Integer.parseInt(Long.toString(a.getTime()).substring(0, 8)); //finner arrangementsdatoen ved å fjerne de 4 siste tallene i "time", slik at det kan sammenlignes med gitt dato
            if (arrDate == date) {
                findDate.add(a);
            }
        }
        if (findDate.size() > 0) {
            return findDate;
        } else {
            return null; // ingen funnet
        }
    }

    //finne alle arrangementer fra en dato til en annen
    public ArrayList<Event> getAllFromDates(int date1, int date2) {
        ArrayList<Event> findDate = new ArrayList<>();
        Iterator<Event> iterator = eventReg.iterator();
        while (iterator.hasNext()) {
            Event a = iterator.next();
            int arrDate = Integer.parseInt(Long.toString(a.getTime()).substring(0, 8));

            if (date1 <= arrDate && arrDate <= date2) {
                findDate.add(a);
            }
        }
        //sorterer arrayet
        findDate.trimToSize();
        Collections.sort(findDate);
        if (findDate.size() > 0) {
            return findDate;
        } else {
            return null; // ingen funnet
        }
    }

    //lister over alle arrangementer, sortert etter henholdsvis sted, type og tidspunkt.
    public ArrayList<Event> sortByPlace() {
        ArrayList<Event> sorted = new ArrayList<>(this.eventReg);
        Collections.sort(sorted, new SortPlace());
        return sorted;
    }

    public ArrayList<Event> sortByType() {
        ArrayList<Event> sorted = new ArrayList<>(this.eventReg);
        Collections.sort(sorted, new SortType());
        return sorted;
    }

    public ArrayList<Event> sortByTime() {
        ArrayList<Event> sorted = new ArrayList<>(this.eventReg);
        Collections.sort(sorted);
        return sorted;
    }
}
