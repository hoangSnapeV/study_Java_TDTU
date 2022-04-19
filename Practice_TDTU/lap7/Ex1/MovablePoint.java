package Practice_TDTU.lap7.Ex1;

public class MovablePoint implements Movable{
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;

    public MovablePoint() {
        this.x = 0;
        this.y = 0;
        this.xSpeed = 1;
        this.ySpeed = 1;
    }

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override 
    public String toString() {
        return String.format("MovablePoint(%d, %d) with xSpeed = %d , ySpeed = %d", x, y, xSpeed, ySpeed);
    }

    
    @Override
    public void moveUp() {
        y += ySpeed;  
    }
    @Override
    public void moveDown() {
        y -= ySpeed;  
    }
    @Override
    public void moveRight() {
        x += xSpeed;

    }
    @Override
    public void moveLeft() {
        x -= xSpeed;
    }
}
