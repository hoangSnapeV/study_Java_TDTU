public class Circle implements GeometricObject{
    protected double radius;

    public Circle() {
        this.radius = 1.0;
    }
    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    } 
    public double getRadius() {
        return radius;
    }

    @Override 
    public double getArea() {
        return 3.14 * radius * radius;
    }
    @Override
    public double getPerimeter() {
        return 3.14 * 2 * radius;
    }

    public String toString() {
        return "Circle[ " + radius + " ]";
    }
}
