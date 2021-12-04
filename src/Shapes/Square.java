package Shapes;

public class Square extends Rectangle {
    protected double side;

    public Square(double side){
        this.side = side;
    }
    public Square(double side, String color, boolean filled)
    {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }
    public void setSide(double side) {this.side = side;}

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }
    @Override
    public void setLength(double length){
        super.setLength(length);
    }
    @Override
    public String toString() {
        return "Square{}";
    }
}