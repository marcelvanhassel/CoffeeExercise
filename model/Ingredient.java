package model;

public class Ingredient {
    // attributes
    private int amount;

    // constructor
    public Ingredient(int amount) {
        this.amount = amount;
    }

    // getters and setters
    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    // Business methods
    public void useIngredient(int amount) {
        if (this.amount >= amount) {
            this.amount -= amount;
        }
    }

}
