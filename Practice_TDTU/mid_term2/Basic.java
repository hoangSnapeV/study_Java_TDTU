package Practice_TDTU.mid_term2;

import java.util.Scanner;
import java.util.Arrays;

public class Basic {
    public static void main(String[] args) {
        //printArray(InputArray());
        int[] arr = {-33, 41, 3, -2, 55, 33, 44, 22, -16};
        int[] arr1 = {3, 1, 5,7, 9};
        int[] arr2 = {3, 1, 4, 5,7, 9, -2, 6};

        printArray(EvenNum(arr));
        System.out.println(minNum(arr));
        System.out.println(firstEvenNum(arr));

        System.out.println(findMaxEvenNum(arr2));

        System.out.println(averageEven(arr2));
        //
        String ktx = "Hoang Dinh Quy Vu mssv 521h0517";
        System.out.println("result = " + ktx.length());
        System.out.println("2.1 = " + countWords(ktx));

        String x1 = "hoang vu Dinh quy vu heloo everyone";
        System.out.println("'" + capitalLetter(x1) + "'");

        System.out.println("'" + captitalLetterN(x1) + "'");
        String x2 = "An Hoang vu hello In";
        System.out.println("'" + capitalLetterConsonants(x2) + "'");

        String x3 = "   Good  moring everyone,   my name is Vu and you can call me   Snape    .";
        System.out.println("'" +deleteSpace(x3) + "'");
    }

    public static int[] InputArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter, n = ");
        int n = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n ; i++) {
            a[i] = sc.nextInt();

        }
        return a;
    }
    
    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; i ++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int[] EvenNum(int[] array) {
        int[] result = new int[array.length];
        int index = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0){
                result[index] = array[i];
                index++;
            }
        }

        int[] arr = Arrays.copyOf(result, index);
        return arr;
    }

    public static int minNum(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if(min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    public static int firstEvenNum(int[] array) {
        for(int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0) {
                return i;
            }
        }
        return -1;
    }

    public static int findMaxEvenNum(int[] array) {
        int x = firstEvenNum(array);
        if(x == -1) {
            return -1;
        }

        int max = array[x];
        for(int i = x; i < array.length; i++) {
            if(max < array[i] && array[i] % 2 == 0) {
                max = array[i];
            }
        }
        return max;
    }

    public static int sumEvenNum(int[] array) {
        int sum = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0) {
                sum += array[i];
            }
        }
        return sum;
    }

    public static double averageEven(int[] array) {
        double avg = 0;
        double count = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0) {
                avg += array[i];
                count++;
            }
        }
        return avg / count;
    }

    //Input String
    public static int countWords(String x) {
        String[] str1 = x.split(" ");
        return str1.length;
    }

    public static String fistLastName(String str) {
        String[] names = str.split(" ");
        if (names.length == 1) {
            return names[0];
        }
        return names[0] + names[names.length - 1];
    }

    public static String capitalLetter(String str) {
        String[] names = str.split(" ");
        String result = "";

        for(int i = 0; i < names.length; i++) {
            names[i] = names[i].substring(0, 1).toUpperCase() + names[i].substring(1);
            if (i != names.length - 1) {
                result = result + names[i] + " ";
            } else {
                result = result + names[i];
            }
        }
        return result;
        
    }   

    public static String captitalLetterN(String str) {
        String[] names = str.split(" ");
        String result = "";
        for(int i = 0; i < names.length; i++) {
            for(int j = 0; j < names[i].length(); j++) {
                if(names[i].charAt(j) == 'n') {
                    names[i] = names[i].substring(0, j) + names[i].substring(j, j + 1).toUpperCase() + names[i].substring(j + 1);
                }
            }
            if(i != names.length - 1) {
                result = result + names[i] + " ";

            } else result = result + names[i];
        }
        return result;
    }

    public static String capitalLetterConsonants(String str) {
        String[] names = str.split(" ");
        String result = "";
        for(int j = 0; j < names.length; j++) {
            for(int i = 0; i < names[j].length(); i++) {
                char x = names[j].charAt(i);
                if(x != 'u' && x != 'e' && x != 'o' && x != 'a' && x != 'i') {
                    names[j] = names[j].substring(0, i) + names[j].substring(i, i + 1).toUpperCase() + names[j].substring(i + 1);
                } 
                
            }
            if(j != names.length -1) {
                result = result + names[j] + " ";
            } else result = result + names[j];
        }
        
        
        return result;
    }

    public static String deleteSpace(String str) {
        String str2 = str.trim();
        
        str2 = str2.replaceAll("\\s+", " ");
        return str2;
    }

}
