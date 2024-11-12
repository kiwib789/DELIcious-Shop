public abstract class Product extends Price {
    protected String name;
    private double price;


    // Constructor
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Abstract method because each product will have a difference price
    @Override
    public abstract double getPrice();
}
