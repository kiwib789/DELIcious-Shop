public class Chips extends Product {
    public Chips(String name, double price) {
        super(name, price);
    }

    @Override
    public double getPrice() {
        return 0;
    }
}
