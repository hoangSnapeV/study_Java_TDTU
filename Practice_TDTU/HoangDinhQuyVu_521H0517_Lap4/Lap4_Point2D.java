package Practice_TDTU.HoangDinhQuyVu_521H0517_Lap4;

public class Lap4_Point2D {
    private float  x;
    private float y;

    public float getX() {
        return x;
    }
    
    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }
    public void setY(float y) {
        this.y = y;
    }

    public Lap4_Point2D() {
        this(0 , 0);
    }

    public Lap4_Point2D(float x, float y) {
        this.setX(x);
        this.setY(y);
    }
    

}
