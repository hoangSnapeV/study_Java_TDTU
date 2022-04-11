package Practice_TDTU.lap6.ex1;
public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
        super();
        this.height = 1.0; 
    }
    
    public Cylinder(double radius) {
        super();
        super.setRadius(radius);
        this.height = 1.0;
    }

    public Cylinder(double radius, double height) {
        super();
        super.setRadius(radius);
        this.height = height;
    }

    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume() {
        return super.getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder[" + height + ", " + radius + ", " + getVolume() +"]";
    }
 

}
