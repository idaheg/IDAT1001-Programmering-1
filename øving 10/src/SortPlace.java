import java.util.Comparator;

public class SortPlace implements Comparator<Event> {

    @Override
    public int compare(Event o1, Event o2) {
        String event1 = o1.getPlace().toLowerCase();
        String event2 = o2.getPlace().toLowerCase();
        return event1.compareTo(event2);
    }
}
