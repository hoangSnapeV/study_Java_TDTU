package Practice_TDTU.lap3;

import java.util.Arrays;
import java.util.Scanner;

public class DoLap3 {
    
    public static void main(String[] args) {
        int[] arr = new int[] {3, 2, 4, 1, 2, 5};
        printArray(arr);
        System.out.print("Exercise 1.1: ");
        printArray(removeElement(arr, 4));

        int[] arr_1 = new int[] {1, 2, 4, 3};
        System.out.print("Exercise 1.2: ");
        printArray(insertElement(arr_1, 5, 2));

        int[] arr2 = new int[] {1, 3, 1, 3, 2, 4, 5, 6, 1, 3, 2, 7};
        System.out.print("Exercise 1.3: ");
        printArray(findDuplicate(arr2));

        System.out.print("Exercise 1.4: ");
        printArray(removeDuplicate(arr2));

        ///exercise 2 -  matrix 2 x 2

        int[][] matrix1 = {{1, 2}, {3, 4}};
        int[][] matrix2 = {{5, 6}, {7, 8}};
        
        System.out.println("Exercise 2.1: ");
        printMatrix(addMatrix(matrix1, matrix2)); 

        System.out.println("Exercise 2.2: ");
        printMatrix(multiplyMatrix(matrix1, matrix2));

        //Exercise 3
        System.out.print("Exercise 3.1: ");
        String name = "Nguyen Van Chien";
        System.out.println(firstAndLastName(name));

        System.out.print("Exercise 3.2: ");
        String name2 = "Nguyen Thi Thu Thao";
        System.out.println(middleName(name2));
        
        System.out.print("Exercise 3.3: ");
        String name3 = "nguyen van chien vu";
        System.out.println(capitalizeAll(name3));

        System.out.print("Exercise 3.4: ");
        System.out.println(upVowAndLowCon(name)); 

        //Exercise 4
        System.out.println("Exercise 4.1: Hoang Snape - len = " + lengthOfString("Hoang Snape"));
        System.out.printf("Exercise 4.2: %s - %d%n", name3, countWords(name3));
        System.out.println("Exercise 4.3: " + concatenateString(name2 , name3));
        System.out.println("Exercise 4.4: 'madam' String is palindrome:  " + checkPalindrome("madam"));

        //Exercise 5
        String a = "You are living on a Plane. What you style Flatland is the vast level surface of what I may call a fluid, on, or in, the top of which you and your countrymen move about, without rising above it or falling below it";

        String[] words = a.split("\\W+"); // original 
        String[] afterRemove1 = removeDuplicate(words);
        System.out.println("Exercise 5: ");
        countAppear(afterRemove1, words);

        

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

    //////////////////
    //Lap3 
    //Exercise 1
    //1.1
    public static int findIndex(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                return i;
            }
        }
        return -1;
    }
    
    public static int[] removeElement(int[] arr, int n) {
        int index = findIndex(arr, n);
        if (index == -1) {
            return arr;
        } else {

            int[] temp = new int[arr.length -1];
            int index_temp = 0;
            for (int i = 0; i < arr.length; i++) {

                if (i != index) {
                    temp[index_temp] = arr[i];
                    index_temp++;
                }
                    
                
            }
            //printArray(temp);

            return temp;
        }
    }

    //1.2
    public static int[] insertElement(int[] arr , int x, int positive) {
        int[] newArray = new int[arr.length];
        int index = 0;
        for (int i = 0; i <= positive; i++) {
            if(i != positive) {
                newArray[index] = arr[i];
                index++;
            } else {
                newArray[index] = x;
                index++;
            } 
            
        }
        
        for (int i = positive; i < arr.length - 1 ; i++) {
            newArray[index] = arr[i];
            index++;
        }

        return newArray;
    }
    ///1.3
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

        int[] result = Arrays.copyOf(temp, index);

        return result;
    }

    ///1.4
    public static int[] removeDuplicate(int[] arr) {
        int[] result = findDuplicate(arr);
        //create array, value =  0
       
        int[] arr_1 = new int[arr.length];
        for (int i = 0; i < arr_1.length; i++) {
            arr_1[i] = 0;
        }
        int count = 0;
        for (int i = 0; i < result.length; i++) {
            
            for (int j = 0; j < arr.length; j++) {
                if (result[i] == arr[j]) {
                    if(count > 0) {
                        arr_1[j] = 1;
                    }
                    count++;
                }
            }
            count = 0;
        }
        
        //
        int[] newArray_1 = new int[arr.length];
        int index = 0;
        for (int i = 0; i < newArray_1.length; i++) {
            if (arr_1[i] == 0) {
                newArray_1[index] = arr[i];
                index++;
            }
        }
        

        int[] arrayAfter = Arrays.copyOf(newArray_1, index);

        return arrayAfter;
    }

    /// Exercise 2
    //2.1
    public static int[][] addMatrix(int[][] matrix1, int[][] matrix2) {
        int[][] sum = new int[matrix1.length][matrix1[0].length];

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
            
        }
        return sum;
    }
    
    //2.2 
    public static int[][] multiplyMatrix(int[][] matrix1, int[][] matrix2) {

        int r1 = matrix1.length;
        int c1 = matrix1[0].length;

        int r2 = matrix2.length;
        int c2 = matrix2[0].length;
        int[][] mul = new int[r1][c2];
        
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                mul[i][j] = 0;
                for (int k = 0; k < c1; k++) {
                    mul[i][j] = mul[i][j] + matrix1[i][k] * matrix2[k][j];
                }

            }
        }

        return mul;
    }
    //2.3
    public static void printMatrix(int[][] matrix) {
        // System.out.println(matrix[0].length);// column
        // System.out.println(matrix.length);// row

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "\t ");
            }
            System.out.println();
        }
    }

    //Exercise 3
    //3.1
    public static String firstAndLastName(String name) {
        String[] names = name.split(" ");

        //return names[0].concat(names[names.length - 1].toString());
        return names[0] + " " + names[names.length - 1];
    }
    
    //3.2
    public static String middleName(String name) {
        String[] names = name.split(" ");
        String result = "";

        for (int i = 1; i < names.length - 1; i++) {
            result += names[i] + " ";
        }
        return result;
    }
    
    //3.3
    public static String capitalizeAll(String names) {
        String[] nameAll = names.split(" ");

        String afterCap = "";
        for (int i = 0; i < nameAll.length; i++) {
            String x = nameAll[i].substring(0, 1).toUpperCase() + nameAll[i].substring(1);
            
            afterCap += x + " ";
        }
        return afterCap;
    }

    //3.4
    public static String upVowAndLowCon(String name) {
        //ue oai
        char u = 'u', e = 'e', o = 'o', a = 'a', i = 'i';

        name = name.toLowerCase();
        String newName = name;

        for (int j = 0; j < name.length(); j++) {

            if(newName.charAt(j) == u || newName.charAt(j) == e || newName.charAt(j) == o || newName.charAt(j) == a|| newName.charAt(j) == i) {
                newName = newName.substring(0, j ) + newName.substring(j, j + 1).toUpperCase() + newName.substring(j + 1);
            }
        }
        return newName;
        
    }

    //4.1
    public static int lengthOfString(String st) {
        int length = 0;

        char[] strCharArray = st.toCharArray();
        for (char c : strCharArray) {
            length++;
        }
        return length;
    }
    //4.2
    public static int  countWords(String str) {
        String[] array = str.split(" ");

        return array.length;
    }

    //4.3
    public static String concatenateString(String str1, String str2) {
        return str1 + " " + str2;
    }
    //4.4
    public static String reverseString(String str) {
        char[] str1 = new char[str.length()];
        int index = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            str1[index] = str.charAt(i);
            index++;
        }

        String arr = "";
        for (int i = 0; i < str1.length; i++) {
            arr = arr + Character.toString(str1[i]);
        }
        
        return arr;
    }

    public static boolean checkPalindrome(String str) {
        String afterReverse = reverseString(str);

        return str.equals(afterReverse);

    }

    //Exercise 5
    //print element in String
    public static void printString(String[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d %s%n",i ,arr[i]);
        }
    }
    //
    public static String[] findStringDuplicate(String[] words) { 
        
        //String to lower
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].toLowerCase();
        }
        // for (int i = 0; i < words.length; i++) {
        //     System.out.printf("%d %s\n",i ,words[i]);
        // }
        String[] dul = new String[words.length];
        int index = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    dul[index] = words[i];
                    index++;
                }
            }
        }
        String[] result = Arrays.copyOf(dul, index);
        return result;

    }
    //

    public static String[] removeDuplicate(String[] words) {
        String[] result = findStringDuplicate(words); 

        int[] arr_1 = new int[words.length];
        for (int i = 0; i < arr_1.length; i++) {
            arr_1[i] = 0;
        }

        int count = 0;
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < arr_1.length; j++) {
                if (result[i].equals(words[j])) {
                    if (count > 0) {
                        arr_1[j] = 1;
                    }
                    count++;
                }
            }
            count = 0;
        }

        String[] newArray_1 = new String[words.length];
        int index = 0;
        for (int i = 0; i < newArray_1.length; i++) {
            if (arr_1[i] == 0) {
                newArray_1[index] = words[i];
                index++;
            }
        }   

        String[] after = Arrays.copyOf(newArray_1, index);
        return after;

    }
    //
    public static void countAppear(String[] afterRemove, String[] original) {
        int[] times = new int[afterRemove.length];
        int count = 0;
        for (int i = 0; i < afterRemove.length; i++) {
            for (int j = 0; j < original.length; j++) {
                if (afterRemove[i].equals(original[j])) {
                    count++;
                }
            }
            times[i] = count;
            count = 0;
        }

        for (int i = 0; i < times.length; i++) {
            System.out.printf("'%s': %d %n", afterRemove[i], times[i]);
        }
    }   
}