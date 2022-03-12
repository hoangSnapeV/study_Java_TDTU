package Practice_TDTU.lap3;

import java.util.Scanner;

public class DoLap3 {
    public static void main(String[] args) {
        int[] arr = new int[] {3, 2, 4, 1, 2, 5};
        //System.out.println(removeElement(arr, 4));

        int[] arr1 = new int[] {1, 3, 1, 3, 2, 4};
        printArray(findDuplicate(arr1));

        String name = "Nguyen Van Chien";
        System.out.println(firstAndLastName(name));
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
            System.out.println();
        }
    
    //3.1.4
    public static int findIndex(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                return i;
            }
        }
        return -1;
    }
    // tuwf sua
    public static boolean removeElement(int[] arr, int n) {
        int index = findIndex(arr, n);
        if (index == -1) {
            return false;
        } else {

            int[] temp = new int[arr.length -1];
            int index_temp = 0;
            for (int i = 0; i < arr.length; i++) {

                if (i != index) {
                    temp[index_temp] = arr[i];
                    index_temp++;
                } else {
                    continue;
                }
            }
            printArray(temp);

            return true;
        }
    }

    ///
    public static int[] findDuplicate(int[] arr) {
        int[] temp = new int[arr.length];
        int index = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    temp[index] = arr[i];
                    index++;
                }
            }
        }
        System.out.println(index);

        int[] result = new int[index];
        for (int i = 0; i < result.length; i++) {
            result[i] = temp[i];
        }

        return result;
    }


    //lap3 3.3
    public static String firstAndLastName(String name) {
        String[] names = name.split(" ");

        //return names[0].concat(names[names.length - 1].toString());
        return names[0] + " " + names[names.length - 1];
    }

    //
    public static String caitalizeAll(String names) {
        String[] nameAll = names.split(" ");

        String x = nameAll[0];
        for (int i = 0; i < x.length(); i++) {
            
        }
        return 0;
    }

    //lap5.3 
    //String[] words = line.split("\\W+");

    public static void slip(String a) {
        String[] words = a.split("\\W+");
        System.out.println(words.length);

        int[] n = new int[words.length];

        for (int i = 0; i < n.length; i++) {
            n[i] = 0;
        }

        String[] temp = new String[words.length];

        int indexTemp = 0;
        for (int i = 0; i < words.length; i++) {
            boolean exit = false;

            for (int j = 0; j < indexTemp; j++) {
                if (words[i].equals(temp[j])) {
                    exit = true;
                    n[j] +=1;
                    continue;
                }
            }
            if (exit == false) {
                temp[indexTemp] = words[i];

                n[indexTemp++] += 1;
            }

        }

        for (int i = 0; i < indexTemp; i++) {
            System.out.print(temp[i]);
            System.out.print(":" + n[i]);
            System.out.println();
        }
        System.out.println(indexTemp);

    }


}
