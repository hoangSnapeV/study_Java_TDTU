package Practice_TDTU.Lap1;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.printf("max = %d%n", findMax(a, b, c));
    }

    public static int findMax(int a, int b, int c) {
        int result = a;
        if (b > result) {
            result = b;
        }
        if (c > result) {
            result = c;
        }

        return result;
        
    }
}
