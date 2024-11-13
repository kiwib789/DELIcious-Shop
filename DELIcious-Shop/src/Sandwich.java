import Enums.SandwichSize;
import Enums.Toppings;

import java.util.ArrayList;
import java.util.List;

import static Enums.SandwichSize.LARGE;
import static Enums.SandwichSize.MEDIUM;


public class Sandwich extends Product {

    // Sandwich class to represent a sandwich with bread type, ingredients, size, and if it is toasted or not

    private String breadType;

    private List<String> ingredients;

    private String size;

    private boolean isToasted;

    private final List<Toppings> toppings = new ArrayList<>();


    // constructor for sandwich class

    public Sandwich(String name, String breadType, List<String> ingredients, String size, boolean isToasted) {
        super(name, 0);

        this.breadType = breadType;

        this.ingredients = ingredients;

        this.size = size;

        this.isToasted = isToasted;


    }


    // getters and setters

    public String getBreadType() {

        return breadType;

    }


    public void setBreadType(String breadType) {

        this.breadType = breadType;

    }


    public List<String> getIngredients() {

        return ingredients;

    }


    public void setIngredients(List<String> ingredients) {

        this.ingredients = ingredients;

    }


    public String getSize() {

        return size;

    }


    public void setSize(String size) {

        this.size = size;

    }


    public boolean isToasted() {

        return isToasted;

    }


    public void setToasted(boolean toasted) {

        isToasted = toasted;

    }

    public void addTopping(Toppings topping) {
        toppings.add(topping);

    }

    // method to get the total price of the sandwich

    public void totalPrice() {

        public double getPriceBySize () {
            double result;
            // Get sandwich size of small, medium, or large
            switch (size) {
                case LARGE:
                    result = 8.50;
                    break;
                case MEDIUM:
                    result = 7.00;
                    break;
                case SMALL:
                    result = 5.50;
            }
            return result;
        }

    }

    @Override

    public String toString() {

        return "Sandwich{" +

                "breadType='" + breadType + '\'' +

                ", ingredients=" + ingredients +

                ", size='" + size + '\'' +

                ", isToasted=" + isToasted +

                '}';

    }

    @Override
    public double getPrice() {
        return 0;
    }
}