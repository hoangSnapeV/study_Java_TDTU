package Practice_TDTU.Lap1;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double base = sc.nextDouble();
        double height = sc.nextDouble();
        double result = 0;

        result = areaOfTriangle(base, height);
        System.out.printf("Area of Triangle = %f", result);
    }

    public static double areaOfTriangle(Double base, Double height) {
        double area = (1.0 / 2) * base * height;
        System.out.println(area);
        return area;
    }
}
