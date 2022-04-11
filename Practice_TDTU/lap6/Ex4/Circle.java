package Practice_TDTU.lap6.Ex4;

public class Circle extends Shape {
    private double radius;
    public Circle() {
        super();
        this.radius = 1.0;
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return 3.14 * radius * radius;
    }

    public double getPerimeter() {
        return 3.14 * 2 * radius;
    }
    @Override 
    public String toString() {
        return "Circle[" + super.color + ", " + super.filled + ", " + super.color + "]";
    }
}
