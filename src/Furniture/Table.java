package Furniture;

public class Table extends Furniture{
    private int price;

    public Table(String color, String size, int price) {
        super(color, size);
        this.price = price;
    }

    public void furnitureInfo(){
        System.out.println("Цвет: " + super.getColor() + " Paзмер: " + super.getSize() + " Цена: " + price);
    }
}