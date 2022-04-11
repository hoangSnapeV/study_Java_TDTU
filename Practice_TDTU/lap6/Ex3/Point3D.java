package Practice_TDTU.lap6.Ex3;

public class Point3D extends Point2D{
    private float z;

    public Point3D() {
        super();
        this.z = 0.0f;
    }

    public Point3D(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public float getZ() {
        return z;
    }
    public void setZ(float z) {
        this.z = z;
    }

    public Float[] getXYZ() {
        Float[] f = new Float[3];
        f[0] = x;
        f[1] = y;
        f[2] = z;

        return f;
    }
    public void setXYZ(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return "Point3D[" + super.x + ", " + super.y + ", " + z + "]";  
    }
}
