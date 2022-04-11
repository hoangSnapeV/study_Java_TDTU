package Practice_TDTU.lap6.ex1;
import java.util.Calendar;


public class Test {
    public static void main(String[] args) {
        Cylinder cr = new Cylinder(3.0, 4.0);
        System.out.println(cr.getRadius());
        System.out.println(cr.toString());

        Cylinder cr1 = new Cylinder();
        System.out.println(cr1.toString());
        int year = Calendar.getInstance().get(Calendar.YEAR);
        System.out.println(year);

    }
}
