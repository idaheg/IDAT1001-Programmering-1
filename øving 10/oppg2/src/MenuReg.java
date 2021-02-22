import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class MenuReg {
    private ArrayList<Menu> menus;

    public MenuReg(ArrayList<Menu> menus) {
        this.menus = menus;
    }
    //registerer ny rett
    public boolean regDish(String name, Dish dish) {
        for (Menu menu : menus) {
            if (menu.getNAME().equalsIgnoreCase(name)) {
                menu.regDish1(dish);
                return true;
            }
        }
        return false;
    }

    //metode for å legge til meny
    public boolean addMenu(Menu m) {
        if (!menus.contains(m)) {
            menus.add(m);
            return true;
        }
        return false;
    }
    
    //finner en rett, gitt navnet
    public Dish findDish(String name) {
        Iterator<Menu> iterator = menus.iterator();
        while (iterator.hasNext()) {
            Menu m = iterator.next();
            for (Dish dish : m.getDishes()) {
                if (dish.getNAME().equalsIgnoreCase(name)) {
                    return dish;
                }
            }
        }
        return null;
    }

    //finner alle retter av en gitt type
    public ArrayList<Dish> findDishes(String type) {
        ArrayList<Dish> typeDish = new ArrayList<>();
        Iterator<Menu> iterator = menus.iterator();
        while (iterator.hasNext()) {
            Menu m = iterator.next();
            for (Dish dish : m.getDishes()) {
                if (dish.getType().equalsIgnoreCase(type)) {
                    typeDish.add(dish);
                }
            }
        }
        return typeDish;
    }

    //registrere ny meny
    public void regMenu(String name, ArrayList<Dish> dishes) {
        Menu newMenu = new Menu(name, dishes);
        menus.add(newMenu);
    }

    //finner alle menyer med totalpris innenfor gitt intervall
    public ArrayList<Menu> findMenuWithPrice(double min, double max) {
        ArrayList<Menu> menusWithPrice = new ArrayList<Menu>();
        Iterator<Menu> iterator = menus.iterator();
        while (iterator.hasNext()) {
            Menu m = iterator.next();
            if (min <= m.getTotalPrice() && m.getTotalPrice() <= max) {
                menusWithPrice.add(m);
            }
        }
        return menusWithPrice;
    }

    public String toString() {
        String text = "";
        for (Menu menu : menus) {
            text += menu.getNAME() + ":\n" + menu.toString() + "\ntotalpris: " + menu.getTotalPrice() + "\n";
        }
        return text;
    }
}
