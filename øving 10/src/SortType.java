import java.util.Comparator;

public class SortType implements Comparator<Event> {

    @Override
    public int compare(Event o1, Event o2) {
        String event1 = o1.getType().toLowerCase();
        String event2 = o2.getType().toLowerCase();
        return event1.compareTo(event2);
    }
}
