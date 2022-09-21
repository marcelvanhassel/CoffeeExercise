package model;

public class Coffee {
    // Attributes
    private int strength;
    private String[] supplements;

    // constructor
    public Coffee(int strength) {
        this.strength = strength;
    }

    // getters and setters
    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String[] getSupplements() {
        return supplements;
    }

    public void setSupplements(String[] supplements) {
        this.supplements = supplements;
    }

}
