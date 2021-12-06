package Nameable;

public class Languages implements Nameable{
    public String name;

    public Languages(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
