package Practice_TDTU.Inheritance;

public class Circle {
    protected  double radius;
    protected String color;

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getArea() {
        return 3.14 * radius * radius;
    } 
    @Override
    public String toString() {
        return "Circle[" + radius + ", " + color +  "]";
    }
    
}
