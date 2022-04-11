package Practice_TDTU.lap6.Ex3;


public class Point2D {
    protected float x;
    protected float y;

    public Point2D() {
        this.x = 0.0f;
        this.y = 0.0f;
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;

    }
    public float getX() {
        return x;
    }
    public void setX(float x) {
        this.x = x;
    }
    public float getY() {
        return y;
    }
    public void setY(float y) {
        this.y = y;
    }

    public Float[] getXY() {
        Float[] f = new Float[2];
        f[0] = x;
        f[1] = y;
        return f;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString() {
        return "Point2D[" + x + ", " + y + "]";
    }
}
