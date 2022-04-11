package Practice_TDTU.lap6.Ex3;

public class Test {
    public static void main(String[] args) {
        Point3D p = new Point3D(22, 8, 3);
        for (int i = 0; i < p.getXYZ().length; i++) {
            System.out.println(p.getXYZ()[i]);
        }
        //System.out.println(p.getXY());

    }
}
