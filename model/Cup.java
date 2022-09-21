package model;

public class Cup {
    // attributes
    private String color;
    private Coffee contents;
    private boolean isEmpty;

    // constructor
    public Cup(String color) {
        this.color = color;
        this.isEmpty = true;
    }

    // getters and setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Coffee getContents() {
        return contents;
    }

    public void setContents(Coffee contents) {
        this.contents = contents;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }
}
