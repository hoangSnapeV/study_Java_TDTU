package HomeWorkInSlide.Abs1;

abstract class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    public abstract String getArea();
    public abstract String toString();
}
