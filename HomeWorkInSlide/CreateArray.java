package HomeWorkInSlide;


import java.util.Scanner;

import test_document.array_part2;

public class CreateArray {

    public static void printArray(int[] array) {
        
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void listNegNum(int n, int[] array) {
        for (int i = 0; i < n; i++) {
            if (array[i] < 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }

    public static int maxValue(int n, int[] array) {
        int max = array[0];
        for (int i = 1; i < n; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    public static int findIndexNeg(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                return i;
            }
        }


        return -1;
    }

    public static int sumOfArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static void sortArrayIncrease(int[] array) {
        int temp = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                    
                }
            }
        }

    }

    public static int[] addElementFirst(int x, int[] array) {
        int[] newArray = new int[array.length + 1];
        newArray[0] = x;
        for (int i = 0; i < array.length; i++) {
            newArray[i+1] = array[i];
        }

        return newArray;
            
    }

    public static int[] deleteGraterThanZero(int[] array) {
        
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                index = i;
                break;
            }
        }

        System.out.println(index);
        int[] newArray;
        if (index >= 0) {
            newArray = new int[array.length - 1];
        } else
            {
                return array;
            }

        for (int i = 0; i < array.length; i++) {
            if(index > i){
                newArray[i] = array[i];
            } 
            if(index < i) 
            {
                newArray[i - 1] = array[i];
            }
            
        }
            

        return newArray;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter, n = ");
        int n = sc.nextInt();

        int[] array  = new int[n]; 

        System.out.print("enter n element: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        printArray(array);

        // listNegNum(n, array);

        // System.out.printf("max = %d%n", maxValue(n, array));

        // System.out.println("Index of first Neg = " + findIndexNeg(array));

        // System.out.println("sum = " + sumOfArray(array));

        // //addElementFirst(3, array);

        //int[] arr = addElementFirst(3, array);

        //printArray(arr);

        sortArrayIncrease(array);
        printArray(array);

        // int[] arr_del = deleteGraterThanZero(array);
        // printArray(arr_del);
    }

}
