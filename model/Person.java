package model;

public class Person {

    // attributes
    private String name;

    // constructor
    public Person(String name) {
        this.name = name;
    }

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // business methods
    public void drinkCoffee(Cup cup) {
        cup.setEmpty(true);
        System.out.println("Hmm, coffee coffee!");
    }

}
