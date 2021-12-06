package Furniture;

public class Chair extends Furniture{
    private int price;

    public Chair(String color, String size, int price) {
        super(color, size);
        this.price = price;
    }

    public void furnitureInfo(){
        System.out.println("Цвет: " + super.getColor() + " Paзмер: " + super.getSize() + " Цена: " + price);
    }
}