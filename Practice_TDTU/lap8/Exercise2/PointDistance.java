package Exercise2;

import java.util.ArrayList;

public class PointDistance <T> {
    ArrayList<Point> a1 = new ArrayList<>();

    public void add(Point obj) {
        a1.add(obj);
    }

    public void display() {
        for (Point obj : a1) {
            if (obj.distance() <= 1) {
                System.out.println(obj.toString());
            }
        }
    } 


    public static void main(String[] args) {
        PointDistance<Point> p1 = new PointDistance<Point>(); 
        p1.add(new Point(3, 4));
        p1.add(new Point(4, 4));
        p1.add(new Point(1, 0));
        p1.add(new Point(0, 0.5));

        p1.display();

    }
}
