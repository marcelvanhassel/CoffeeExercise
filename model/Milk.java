package model;

public class Milk extends Ingredient {
    // attributes
    private String type;
    private int temperature;

    // constructor
    public Milk(int amount, String type, int temperature) {
        super(amount);
        this.type = type;
        this.temperature = temperature;
    }

    // getters and setters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
