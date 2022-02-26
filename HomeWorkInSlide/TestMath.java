package HomeWorkInSlide;

import java.util.Scanner;

public class TestMath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter area of a square: ");
        double areaSquare = sc.nextDouble();
        
        double radius = Math.sqrt(areaSquare) / 2;
        double areCircle = Math.PI * Math.pow(radius, 2);

        System.out.printf("Area of Circle = %.4f\n", areCircle);
    }
}
