public class ResizableCircle extends Circle  implements Resizable{
    public ResizableCircle() {
        super();
    }
    public ResizableCircle(double radius) {
        super(radius);
    }
    
    public void resize(int percent) {
        double r = getRadius();
        r = r * percent / 100.0;
        setRadius(r);
    }
    
    public String toString() {
        return "ResizableCircle[" + getRadius() + " ]";
    }
}
