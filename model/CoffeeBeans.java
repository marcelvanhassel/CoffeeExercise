package model;

public class CoffeeBeans extends Ingredient{
    // attributes
    private String type;

    // constructor
    public CoffeeBeans(int amount, String type) {
        super(amount);
        this.type = type;
    }

    // getters and setters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
