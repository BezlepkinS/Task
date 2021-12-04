package Movable;

public class MovablePoint {
    public int x;
    public int y;
    public int xSpeed;
    public int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint{}";
    }

    public void moveUp(){y += ySpeed;}
    public void moveDown(){y -= ySpeed;}
    public void moveLeft(){x -= xSpeed;}
    public void moveRight(){x += xSpeed;}
}