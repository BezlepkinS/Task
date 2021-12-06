package Furniture;

public abstract class Furniture {

    private String color;
    private String size;

    public String getColor() { return color; }
    public String getSize() { return size; }

    public Furniture(String color, String size) {
        this.color = color;
        this.size = size;
    }
    public abstract void furnitureInfo();
}
