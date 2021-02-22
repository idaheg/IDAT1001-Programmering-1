import java.util.Objects;

public class Dish {
    private final String NAME;
    private String type;
    private double price;
    private String recipe;

    public Dish(String name, String type, double price, String recipe) {
        this.NAME = name;
        this.type = type;
        this.price = price;
        this.recipe = recipe;
    }

    public String getNAME() {
        return NAME;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getRecipe() {
        return recipe;
    }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dish dish = (Dish) o;
        return Objects.equals(NAME, dish.NAME);
    }

    @Override
    public String toString() {
        return "Menu{" +
                "NAME='" + NAME + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", recipe='" + recipe + '\'' +
                '}';
    }
}
