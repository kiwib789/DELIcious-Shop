import java.util.List;



public class Sandwich {

    // Sandwich class to represent a sandwich with bread type, ingredients, size, and if it is toasted or not

    private String breadType;

    private List<String> ingredients;

    private String size;

    private boolean isToasted;





    // constructor for sandwich class

    public Sandwich(String breadType, List<String> ingredients, String size, boolean isToasted) {

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

    // method to get the total price of the sandwich

    public void totalPrice(){



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

}