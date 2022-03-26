package Practice_TDTU.lap5;

public class TestPolygon {
    public static void main(String[] args) {
        RegularPolygon re = new RegularPolygon();

        System.out.println(re.toString());

        RegularPolygon re1 = new RegularPolygon("q1", 4);
        System.out.println(re1.toString());
    }
}
