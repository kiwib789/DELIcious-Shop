package Enums;

import static jdk.internal.jrtfs.JrtFileAttributeView.AttrID.size;

public class Toppings {
    private String name;
    private double price;
    private ToppingType type;

    public Toppings(String name, double price, ToppingType type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }



    public double getPriceByMeat(Toppings toppings) {
        double result;
        if (toppings == Meats.LARGE) {
            result = 3.0;
        } else if (toppings == Meats.MEDIUM) {
            result = 2.0;

        } else {
            result = 1.0;
            // do for meat and cheese
        }

        return result;
    }
    public double getPriceByCheese(Toppings toppings){
        double result;
        if (toppings == Toppings.LARGE){
            result = 0.90;
        }
        return result;
    }
}
