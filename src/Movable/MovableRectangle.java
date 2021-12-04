package Movable;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    @Override
    public String toString() {
        return "MovableRectangle{}";
    }

    public void SpeedCheck() {
        if (topLeft.xSpeed != bottomRight.xSpeed | bottomRight.ySpeed != topLeft.ySpeed) {
            System.out.println("Speed not equal\n");
        }
    }

    public void moveUp() {
        topLeft = new MovablePoint(topLeft.x, topLeft.y + topLeft.ySpeed, topLeft.xSpeed, topLeft.ySpeed);
        bottomRight = new MovablePoint(bottomRight.x, bottomRight.y + bottomRight.ySpeed, bottomRight.xSpeed, bottomRight.ySpeed);
    }

    public void moveDown() {
        topLeft = new MovablePoint(topLeft.x, topLeft.y - topLeft.ySpeed, topLeft.xSpeed, topLeft.ySpeed);
        bottomRight = new MovablePoint(bottomRight.x, bottomRight.y - bottomRight.ySpeed, bottomRight.xSpeed, bottomRight.ySpeed);
    }

    public void moveLeft() {
        topLeft = new MovablePoint(topLeft.x - topLeft.xSpeed, topLeft.y, topLeft.xSpeed, topLeft.ySpeed);
        bottomRight = new MovablePoint(bottomRight.x - bottomRight.xSpeed, bottomRight.y, bottomRight.xSpeed, bottomRight.ySpeed);
    }

    public void moveRight() {
        topLeft = new MovablePoint(topLeft.x + topLeft.xSpeed, topLeft.y, topLeft.xSpeed, topLeft.ySpeed);
        bottomRight = new MovablePoint(bottomRight.x + bottomRight.xSpeed, bottomRight.y, bottomRight.xSpeed, bottomRight.ySpeed);
    }
}