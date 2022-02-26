package Practice_TDTU.Lap1;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float base = sc.nextFloat();
        float height = sc.nextFloat();
        float result = 0;

        result = areaOfTriangle(base, height);
        System.out.printf("Area of Triangle = %f", result);
    }

    public static float areaOfTriangle(Float base, Float height) {
        float area = (float)(1) / 2 * base * height;
        System.out.println(area);
        return area;
    }
}
