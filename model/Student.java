package model;

public class Student extends Person{

    // attributes
    public CoffeeMachine myCoffeeMachine = new CoffeeMachine(5, 5, 5);

    // constructor
    public Student(String name) {
        super(name);
    }

    // Getters and setters


    // Business methods
    private Milk buysMilk() {
        System.out.println("Buying new milk!");
        Milk myNewMilk = new Milk(50, "Fresh", 6);
        return myNewMilk;
    }

    private CoffeeBeans buysCoffeeBeans() {
        System.out.println("Buying new coffeebeans");
        CoffeeBeans myNewCoffeeBeans = new CoffeeBeans(50, "Very Strong");
        return myNewCoffeeBeans;
    }

    private Water getsWater() {
        System.out.println("Getting fresh water");
        Water myNewWater = new Water(50);
        return myNewWater;
    }

    public void fillWater(Water water) {
        myCoffeeMachine.setWater(water);
        System.out.println("Filled coffeemachine with water!");
    }

    public void fillCoffeeBeans(CoffeeBeans beans) {
        myCoffeeMachine.setCoffeeBeans(beans);
        System.out.println("Filled coffeemachine with fresh coffeebeans");
    }

    public void fillMilk(Milk milk) {
        myCoffeeMachine.setMilk(milk);
        System.out.println("Filled coffeemachine with fresh milk!");
    }

    public void checkIngredientAvailability(CoffeeMachine coffeeMachine) {
        if (!myCoffeeMachine.checkWater()) {
            this.fillWater(this.getsWater());
        }
        if (!myCoffeeMachine.checkCoffeeBeans()) {
            this.fillCoffeeBeans(this.buysCoffeeBeans());
        }
        if (!myCoffeeMachine.checkMilk()) {
            this.fillMilk(this.buysMilk());
        }
        System.out.println("All ingredients in coffeemachine are filled up!");

    }

    public Cup putCupUnderCoffeeMachine() {
        Cup useCup = new Cup("white");
        return useCup;
    }

    public Cup getsCoffee(String type, Cup cup) {
        checkIngredientAvailability(myCoffeeMachine);
        myCoffeeMachine.putCoffeeInCup(cup, type);
        System.out.println(this.getName() + " got coffee");
        return cup;
    }

    public Cup bringCoffee(String type) {
        return this.getsCoffee(type, this.putCupUnderCoffeeMachine());
    }


}
