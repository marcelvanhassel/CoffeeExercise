package model;

public class Teacher extends Person {

    // attributes
    private boolean needsCoffee;

    // Constructor
    public Teacher(String name) {
        super(name);
        this.needsCoffee = false;
    }

    // getters and setters
    public boolean isNeedsCoffee() {
        return needsCoffee;
    }

    public void setNeedsCoffee(boolean needsCoffee) {
        this.needsCoffee = needsCoffee;
    }

    // business methods
    public void teach() {
        System.out.println("Teach teach teach...");
    }

    public void wantsCoffee(String type, Student student) {
        System.out.println("Asked " + student.getName() + " to bring me a coffee. Muhaha.");
        student.bringCoffee(type);
        System.out.println("Got my coffee");
    }

}
