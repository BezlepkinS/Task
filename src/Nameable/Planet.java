package Nameable;

public class Planet implements Nameable {
    public String name;

    public Planet(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
