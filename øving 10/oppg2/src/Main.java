import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Dish r1 = new Dish("Carpaccio", "forrett", 20, "Lorem Ipsum");
        Dish r2 = new Dish("kjøttboller", "hovedrett", 20, "Lorem Ipsum");
        Menu m1 = new Menu("m1", new ArrayList<>(Arrays.asList(r1, r2)));

        Dish r3 = new Dish("pasta arriabata", "hovedrett", 10, "Lorem Ipsum");
        Dish r4 = new Dish("vaniljeis", "dessert", 10, "Lorem Ipsum");
        Menu m2 = new Menu("m2", new ArrayList<>(Arrays.asList(r3, r4)));

        MenuReg reg1 = new MenuReg(new ArrayList<>(Arrays.asList(m1, m2)));

        Dish r5 = new Dish("lasagne", "hovedrett", 50, "Lorem Ipsum");
        Dish r6 = new Dish("sjokoladeis", "dessert", 50, "Lorem Ipsum");
        Menu m3 = new Menu("m3", new ArrayList<>(Arrays.asList(r5, r6)));

        System.out.println(reg1.addMenu(m3));
        System.out.println("Finn carpaccio: " + reg1.findDish("Carpaccio"));
        Dish r7 = new Dish("carbonara", "hovedrett", 150, "Lorem Ipsum");
        reg1.regDish("m1", r7);
        System.out.println("meny 1: " + m1.toString());
        System.out.println("Menyer med pris mellom 10-50: " + reg1.findMenuWithPrice(10,50).toString());
        System.out.println("Hele registeret: " + reg1.toString());
        reg1.regMenu("m4", new ArrayList<>(Arrays.asList(r1, r6)));
    }
}
