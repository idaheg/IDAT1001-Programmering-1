import java.util.ArrayList;
import java.util.Iterator;

public class Menu {
    private final String NAME;
    private ArrayList<Dish> dishes;

    public Menu(String name, ArrayList<Dish> dishes) {
        this.NAME = name;
        this.dishes = dishes;
    }

    public String getNAME() {
        return NAME;
    }

    public ArrayList<Dish> getDishes() {
        return dishes;
    }

    public void setDishes(ArrayList<Dish> dishes) {
        this.dishes = dishes;
    }

    public boolean regDish1(Dish dish) {
        if (!dishes.contains(dish)){ // forutsetter at person har implementert equals-metoden
            dishes.add(dish);
            return true;
        }
        return false;
    }
    public double getTotalPrice() {
        double totalPrice = 0;
        Iterator<Dish> iterator = dishes.iterator();
        while (iterator.hasNext()) {
            Dish d = iterator.next();
            totalPrice += d.getPrice();
        }
        return totalPrice;
    }
    
    public String toString() {
        String text = "";
        for (Dish dish : dishes) {
            text += dish.getNAME() + ":\ntype: " + dish.getType() + ", pris: " + dish.getPrice() + ", oppskrift: " + dish.getRecipe() + "\n";
        }
        return text;
    }
}
