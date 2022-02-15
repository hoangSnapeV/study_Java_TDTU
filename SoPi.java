import java.util.Scanner;

public class SoPi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of term: ");

        int n = sc.nextInt();
        double pi = 0.0;
        double result = 1, a = 1.0, b = 1.0;


        for (int i = 0; i < n; i++) {
            result = 1.0 / a * b;
            a = a + 2; 
            b = b * -1;
            pi += result;
        }

        System.out.println("PI = " + pi * 4);
    }
}
