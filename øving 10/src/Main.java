public class Main {
    public static void main(String[] args) {
        Event ar = new Event(2, "hei", "Gløs", "Ida", "foredrag", 202010291800L);
        Event br = new Event(1, "hallo", "Gløs", "Ida", "barneteater", 202010301800L);
        Event cr = new Event(3, "hi", "Kalv", "Ida", "konsert", 193010301700L);
        EventRegister reg = new EventRegister();
        reg.addArr(ar);
        reg.addArr(br);
        reg.addArr(cr);
        System.out.println("Arrangementer som foregår på Gløs: " + reg.getAllFromPlace("Gløs").toString());
        System.out.println("Arrangementer som er 29.okt 2020: " + reg.getAllFromDate(20201029).toString());
        System.out.println("Arrangementer som mellom 25-30.okt 2020: " + reg.getAllFromDates(20201025, 20201030).toString());
        System.out.println("Sortert etter sted: " + reg.sortByPlace());
        System.out.println("Sortert etter type: " + reg.sortByType());
        System.out.println("Sortert etter tid: " + reg.sortByTime());
    }
}
