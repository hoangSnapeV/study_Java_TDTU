package Practice_TDTU.HoangDinhQuyVu_521H0517_Lap4;

public class Lap4_Rectangle {
    private float width;
    private float length;

    public Lap4_Rectangle() {
        this(1.0f, 1.0f);
    }
    public Lap4_Rectangle(float width, float length) {
        this.width = width;
        this.length = length;

    }

    public float getWidth() {
        return width;
    }
    public float getLength() {
        return length;
    }

    public float getArea() {
        return width * length;

    }

    public float getPerimeter() {
        return 2 * (length + width);
    }
    public void setLength(float length) {
        this.length = length;
    }
    public void setWidth(float width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle[" + this.width + ", " + this.length + "]";
    }
}
