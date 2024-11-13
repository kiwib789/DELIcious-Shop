package Enums;

public enum DrinkSize {
    SMALL(2.00),
    MEDIUM(2.50),
    LARGE(3.00);

    // Instance variables for the drink type and size
    private String drinkType;
    private DrinkSize size;

    DrinkSize(double v) {
    }

    // Constructor
    public void Drink(String drinkType, DrinkSize size) {
        this.drinkType = drinkType;
        this.size = size;
    }

    // Getter and Setter for drinkType
    public String getDrinkType() {
        return drinkType;
    }

    public void setDrinkType(String drinkType) {
        this.drinkType = drinkType;
    }

    // Getter and Setter for size
    public DrinkSize getSize() {
        return size;
    }

    public void setSize(DrinkSize size) {
        this.size = size;
    }

    // Method to get a description of the drink with size
    public String getDrinkDescription() {
        return String.format("Drink Type: %s\nSize: %s", drinkType, size);
    }

    // Method to change the size of the drink
    public void changeSize(DrinkSize newSize) {
        this.size = newSize;
        System.out.println("Drink size has been changed to: " + newSize);
    }
}

