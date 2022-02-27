package Practice_TDTU.Lap1;

import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter, number = ");
        int n = sc.nextInt();
        reverseNumber(n);
        
    }

    public static void reverseNumber(int n) {
        int temp = n;
        int count = 1;
        while (temp > 10) {
            temp /= 10;
            count *= 10;
        }
        
        int result = 0;
        while (n != 0) {
            temp = n % 10;
            n /= 10;

            result = result + count * temp;
            count /= 10;
        }

        System.out.println(result);

    }
}
