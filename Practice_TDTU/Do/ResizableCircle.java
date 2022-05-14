public class ResizableCircle extends Circle implements Resizable {
    public ResizableCircle() {
        super();
    }
    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public void resize(int percent) {
        double r  = getRadius();
        r = r * percent / 100;
        setRadius(r);
    }
    @Override
    public String toString() {
        return "[ResizableCircle(" + getRadius() + ")]";
    }
}
