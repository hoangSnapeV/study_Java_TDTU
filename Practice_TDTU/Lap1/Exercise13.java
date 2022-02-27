package Practice_TDTU.Lap1;

import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter, Number = ");
        int n = sc.nextInt();

        if (n == reverseNumber(n)) {
            System.out.println("It's a palindrome number");
        } else System.out.println("It's not a palindrome number");
    }

    public static int reverseNumber(int n) {
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

        return result;

    }
}
