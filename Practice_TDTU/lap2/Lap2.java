package Practice_TDTU.lap2;

import java.math.BigDecimal;
import java.util.Scanner;

public class Lap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int[] a = createArray();
        // printArray(a);

        int[] array = {-555, 22, 26, 283, 10, 1, 16, -44, 33, -1111};
        int[] x = {1, 9, 2, 8, 4, 6, -2 };
        int[] y = {2, 3, 5, 7, 11, 13, 4, 20, 30, 37};

        System.out.println("1. Max = " + findMax(array));

        System.out.println("2. Min = " + findMin(array));

        System.out.println("3. Sum = " + sumOfAll(x));

        System.out.println("4. Len = " + array.length); // Exercise 4

        System.out.println("5. Count Prime Number = " + countPrimeNumber(y));

        System.out.println("6. Key Index =" + findKeyIndex(y, 2));
       
        squareAllArray(x);

        // ex8
        
        BigDecimal a[] = inputArray(sc);
        System.out.print("max of array: " + findMax(a));
        System.out.print("\n");

        //ex9
        int[] t = {1, 2, 3, 4, 5, 6, 7};
        System.out.print("9. Enter, k = ");
        int k = sc.nextInt();
        int[] newArray = divisibleNumbers(t, k);

        printArray(newArray);

        // Exercise 10
        sortAscending(t);
        findThirdLargest(t);


    }
    //create array
    public static int[] createArray() {
        Scanner sc  = new Scanner(System.in);

        System.out.print("Enter, n = ");
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
            System.out.print(a[i] + " ");
        }
        System.out.println(2);
    }

    // Exercise 1. Write a function public static int findMax(int arr[]) to find the maximum value of an array.
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        return max;
    }

    // Exercise 2. Write a function to find the minimum value of an array.

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }

        return min;
    }

    // Exercise 3. Write a function to sum all even numbers of an array.

    public static int sumOfAll(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    // Exercise 5. Write a function to count how many prime number in an array.

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

    public static int countPrimeNumber(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (checkPrimeNumber(arr[i])) {
                count++;
            }
        }
        return count;
    }

    // Exercise 6. Write a function public static int find(int arr[], int k) to find the index of an element k in an
    //array, if the element doesn’t exist in an array return -1. (the first element index is 0)

    public static int findKeyIndex(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    //Exercise 7. Write a function public static void square(int arr[]) to square all elements of an array.

    public static void squareAllArray(int[] arr) {

        System.out.print("7. Square all elements = ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(Math.pow(arr[i], 2) + " ");
        }
        System.out.println();
    }

    // Exercise 8. Write a function public static BigDecimal findMax(BigDecimal []arr) to find the maximum
        //value of an BigDecimal object array.

    public static BigDecimal findMax(BigDecimal[] arr) {
        int i;
        BigDecimal max = arr[0];
        for(i = 0;i < arr.length;i++)
        {
            if(arr[i].compareTo(max) == 1)
                max = arr[i];
        }
        return max;

    }

    public static BigDecimal[] inputArray(Scanner sc)
    {
        System.out.print("8. Number of elements: ");
        int n = sc.nextInt();
        BigDecimal arr[] = new BigDecimal[n];
        int i;
        for(i = 0;i < n;i++)
            arr[i] = sc.nextBigDecimal();
        return arr;
    }


    /* Exercise 9 *Write a function public static int[] divisibleNumbers(int arr[], int k) to find the elements which
    divisible by k in an array. (Hint: You can use the loop twice times to solve this problem. The first
    loop will count how many elements meet the condition to define the size. Create a new array
    with this size to contain the result. The second loop will copy elements that meet the condition
    into the result array. Ex: a = [1,2,3,4,5,6,7] with k = 2 → [2,4,6]). */

    public static int countDivisibleNum(int[] arr, int k) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % k == 0) {
                count++;
            }
        }
        return count;
    }

    public static int[] divisibleNumbers(int arr[], int k) {
        
        int[] newArray = new int[countDivisibleNum(arr, k)];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % k == 0) {
                newArray[index] = arr[i];
                index++;
                
            }
        }


        return newArray; 
    }

    // Exercise 10. *Write a function to find the third largest element in an array.

    public static void sortAscending(int[] arr) {

        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp; 
                }
            } 
        }
    }

    public static void findThirdLargest(int[] arr) {
        System.out.print("10. result = ");
        for (int i = 0; i < 3; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    //


    
    
}


