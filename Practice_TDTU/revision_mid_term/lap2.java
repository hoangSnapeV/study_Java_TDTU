package Practice_TDTU.revision_mid_term;

import java.util.Scanner;

public class lap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {-555, 22, 26, 283, 10, 1, 16, -44, 33, -1111};
        int[] x = {1, 9, 2, 8, 4, 6, -2 };
        int[] y = {2, 3, 5, 7, 11, 13, 4, 20, 30, 37};
        
        System.out.println("1. Max = " + findMax(array));

        System.out.println("3. Sum = " + sumOfAll(x));
        
        System.out.println("5. Count Prime Number = " + countPrimeNumber(y));
    }
    //create array
    public static int[] createArray() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter, n = ");
        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            a[i] = x;
        }
        return a;
    }
    //print array
    public static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");

        }
        System.out.println(2);
    }

    //Exercise 1
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        return max;
    }

    //Exercise 2
    public static int sumOfAll(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    //Exercise 5
    public static boolean checkPrimeNumber(int x) {
        if (x > 1) {
            int a = x / 2;
            int count = 0;
            for (int i = 2; i <= a; i++) {
                if (x % i == 0) {
                    count++;
                }
            }

            if (count > 0) {
                return false;
            } else return true;

        }

        return false;
    }

    //
    public static int countPrimeNumber(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (checkPrimeNumber(arr[i])) {
                count++;
            }
        }
        return count;
    }

}


