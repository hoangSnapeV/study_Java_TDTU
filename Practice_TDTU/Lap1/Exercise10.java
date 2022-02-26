package Practice_TDTU.Lap1;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter, n = ");
        int n = sc.nextInt();

        System.out.println("result = " + sumFirstLastDigit(n));
    }

    public static int sumFirstLastDigit(int n) {
        int result = 0;
        int firstDigit = 0;
        int lastDigit = 0;

        lastDigit = n % 10;
        while (n != 0) {
            firstDigit = n % 10;
            n /= 10;
        }
        
        result = firstDigit + lastDigit;
        return result;
    }   
}

