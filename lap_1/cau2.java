package lap_1;

import java.util.Scanner;

public class Cau2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("enter, height = ");
        int h = sc.nextInt();

        System.out.printf("enter, weight = ");
        int d = sc.nextInt();

        System.out.printf("area of rectangle = %d", h * d);
    }
}
