package Enums;

public abstract class Toppings {
    private String name;
    private double price;

    public Toppings(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    // method to get the type of topping
    public void toppingType(){

    }
}
