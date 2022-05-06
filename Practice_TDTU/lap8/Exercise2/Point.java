package Exercise2;

public class Point {
    private double x;
    private double y;

    public Point() {
        this.x = 1;
        this.y = 1;
    }
    public Point(double x, double y) { 
        this.x = x;
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }
    public double getX() {
        return x;
    }
    public void setY(double y) {
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public double distance() {
        return  Math.sqrt(getX() * getX() + getY() * getY());
    }

    @Override
    public String toString() {
        return "Point[" + x + ", " + y + "]";
    }
}
