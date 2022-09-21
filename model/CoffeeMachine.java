package model;

public class CoffeeMachine {
    // attributes
    private Water water;
    private CoffeeBeans coffeeBeans;
    private Milk milk;
    private int amountOfWaterInOneCup;
    private int amountOfCoffeeBeansInOneCup;
    private int amountOfMilkInOneCup;

    // constructor
    public CoffeeMachine(int amountOfWaterInOneCup, int amountOfCoffeeBeansInOneCup, int amountOfMilkInOneCup) {
        this.amountOfWaterInOneCup = amountOfWaterInOneCup;
        this.amountOfCoffeeBeansInOneCup = amountOfCoffeeBeansInOneCup;
        this.amountOfMilkInOneCup = amountOfMilkInOneCup;
    }

    // getters and setters
    public Water getWater() {
        return water;
    }

    public void setWater(Water water) {
        this.water = water;
    }

    public CoffeeBeans getCoffeeBeans() {
        return coffeeBeans;
    }

    public void setCoffeeBeans(CoffeeBeans coffeeBeans) {
        this.coffeeBeans = coffeeBeans;
    }

    public Milk getMilk() {
        return milk;
    }

    public void setMilk(Milk milk) {
        this.milk = milk;
    }

    // business methods
    public void grindCoffee(){
        System.out.println("Grinding coffeebeans grr grr grr");
        int newCoffeeBeansAmount = this.coffeeBeans.getAmount() - this.amountOfCoffeeBeansInOneCup;
        this.coffeeBeans.setAmount(newCoffeeBeansAmount);
    }

    public void heatWater() {
        System.out.println("Heating the water for a delicious cup of coffee prrrrrrrrpffffffft!");
        int newWaterAmount = this.water.getAmount() - this.amountOfWaterInOneCup;
        this.water.setAmount(newWaterAmount);
    }

    public void steamMilk() {
        System.out.println("Steaming the milk for a fancy capucino you frikkin hipster pfffffffff");
        int newMilkAmount = this.milk.getAmount() - this.amountOfMilkInOneCup;
        this.milk.setAmount(newMilkAmount);
    }

    public Coffee pushWaterThroughCoffee() {
        System.out.println("Releasing the pressure, pushing it through!");
        Coffee letsGo = new Coffee(this.amountOfCoffeeBeansInOneCup);
        return letsGo;
    }

    public void addMilk(Coffee coffee) {
        System.out.println("Adding the milk!");
        String[] supplementList = {"steamed milk", "cappucino"};
        coffee.setSupplements(supplementList);
    }

    public boolean checkWater() {
        if (this.water == null) {
            return false;
        }
        if(this.amountOfWaterInOneCup < this.water.getAmount()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkCoffeeBeans() {
        if (this.coffeeBeans == null) {
            return false;
        }
        if(this.amountOfCoffeeBeansInOneCup < this.coffeeBeans.getAmount()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkMilk() {
        if (this.milk == null) {
            return false;
        }
        if(this.amountOfMilkInOneCup < this.milk.getAmount()) {
            return true;
        } else {
            return false;
        }
    }

    public void putCoffeeInCup(Cup cup, String type) {
        if (type.equals("cappuccino")) {
            if (this.checkMilk()) {
                System.out.println("enough milk");
            } else {
                System.out.println("Not enough milk, here is your empty cup");
            }
        }
        if (this.checkWater() & this.checkCoffeeBeans()) {
            System.out.println("Enough water and coffeebeans");
            this.grindCoffee();
            this.heatWater();
            cup.setContents(this.pushWaterThroughCoffee());
            cup.setEmpty(false);
            if (type.equals("cappuccino")) {
                this.steamMilk();
                this.addMilk(cup.getContents());
            }
        } else {
            System.out.println("Not enough coffeebeans and water, enjoy your empty cup :-)");
        }
    }

}
