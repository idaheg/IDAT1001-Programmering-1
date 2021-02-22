import java.util.Objects;

public class Event implements Comparable<Event> {
    private final int NR;
    private String name;
    private String place;
    private String host;
    private String type;
    private long time;

    public Event(int NR, String name, String place, String host, String type, long time) {
        this.NR = NR;
        this.name = name;
        this.place = place;
        this.host = host;
        this.type = type;
        this.time = time;
    }

    public int getNR() {
        return NR;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event that = (Event) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Arrangement nr" + NR +
                ": Arrangementsnavn: " + name + ", " +
                "Sted: " + place + ", " +
                "Arrangør: " + host + ", " +
                "Type: " + type + ", " +
                "Tidspunkt: " + time;
    }

    @Override
    public int compareTo(Event otherEvent) {
        return Long.compare(this.time, otherEvent.getTime());
    }
}
