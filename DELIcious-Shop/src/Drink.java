public class Drink extends Product{
    public Drink(String name, double price) {
        super(name, price);
    }
    public enum drinkSize{
       // small 2.00
        //medium 2.50
        //large 3.00
    }

    drinkType{
    // tea soda water
    }

    @Override
    public double getPrice() {
        return 0;
    }
}
