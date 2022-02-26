package Practice_TDTU.Lap1;


import java.util.Scanner;

public class Exercise8 {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ///run
        System.out.println("a, S = " + function_a(n));

        System.out.println("b, P = " + function_b(n));

        System.out.println("c, S = " + function_c(n));

        System.out.println("d, S = " + function_d(n));

        System.out.println("e, S = " + function_e(n));

    }
    //cau_a
    public static int function_a(int n) {
        int result = 0;
        for (int i = 1; i <= n ; i++) {
            result += i;
        }
        return result;
    }
    // cau_b
    public static int function_b(int n) {
        int result = 1;
        for (int i = 1; i <= n ; i++) {
            result *= i;
        }
        return result;
    }
    //cau_c
    public static int function_c(int n) {
        int result = 0;
        double temp = 0;
        for (double i = 0; i <= n ; i++) {
            temp = Math.pow(2.0, i);
            
            result += temp;
        }
        return result;
    }

    //cau d
    public static float function_d(int n) {
        float result = 0;
        for (float i = 2; i <= n * 2; i = i + 2) {
            result = result + 1 / i;
        }
        return result;
    }

    //cau_e
    public static int function_e(int n) {
        int result = 0;
        double temp = 0;
        for (double i = 0; i <= n ; i++) {
            temp = Math.pow(i, 2);
            
            result += temp;
        }
        return result;
    }
}
