package HomeWorkInSlide.Abs1;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width, String color) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public String getArea() {
        return "length * width;";
    }

    public String getArea(Rectangle r) {
        
    

        return "Wooof";
    }
    @Override 
    public String toString() {
        return "Rectangle[" + length + ", " + width + ", " + color + ", " + getArea()+ "]" ;
    }
}
