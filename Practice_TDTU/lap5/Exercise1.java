package Practice_TDTU.lap5;

import java.util.Scanner;

public class Exercise1 {
    
    public static void main(String[] args) {
        System.out.println("Hello World");
        int[] array = {1, 2, 42, 6, 10, 2, 14};
        System.out.println("Max Even: " + maxEven(array));
        
        String x = "Nguyen Le Trong Tin";
        System.out.println("2.1, result = " + shortName(x));
    
        System.out.println("2.2, result = " + hashtagName(x));

        System.out.println("2.3, result = " + upperCaseAllVowel(x));

        System.out.println("2.4, result = " + upperCaseAllN(x));

        // Exercise 2 // String

        String str = "The Edge Surf is of course also a whole lot better, which will hopefully win Microsoft some converts. It offers time trial, support for other input methods like touch and gamepads, accessibility improvements, high scores, and remastered visuals.";
        //System.out.println(str);
        //String[] result = str.split("\\W+");
        System.out.println("result = " + countWord(str));
        System.out.println("result_2 = " + countSentences(str));
        System.out.println("result_3 = " + countAppear(str, "and"));

        printArray(input(5));
    }
    //1 - Array
    public static int maxEven(int[] a) {
        int max = a[0];
        
        for (int i = 1; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        if (max % 2 == 1) {
            return -1;
        }
        return max;
    }
    
    //
    public static int indexMin(int[] a) {
        
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 1) {
                return i;
            }
        }
        return -1;
    }
    
    public static int midOdd(int[] a) {
        if (indexMin(a) < 0) {
            return -1;
        }
        int min = a[indexMin(a)];
        for (int i = 0; i < a.length; i++) {
            if (min > a[i] && a[i] % 2 == 1) {
                min = a[i];
            } 
        }
        return min;
    }

    //
    public static int sumMEMO(int[] a) {
        return midOdd(a) + maxEven(a);
    }

    public static int sumEven(int[] a) {
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                result += a[i];
            }
        }
        return result;
    }

    public static int prodOdd(int[] a) {
        int result = 1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 1) {
                result *= a[i];
            }
        }
        return result;
    }
    
    public static int idxFirstEven(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                return i;
            }
        }
        return -1;
    }

    public static int idxLastOdd(int[] a) {
        for (int i = a.length -1; i >= 0; i--) {
            if (a[i] % 2 == 1) {
                return i;
            }
        }
        return -1;
    }

    //
    public static int[] input(int n) {
        Scanner sc = new Scanner(System.in);
        int[] result = new int[n];
        for (int i = 0; i < result.length; i++) {
            result[i] = sc.nextInt();
        }
        return result;

    }

    public static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
    //1 -String
    public static String shortName(String str) {
        String[] names = str.split(" ");
        if(names.length == 1) return names[0];
        return names[names.length -1 ].concat(" " + names[0]); 
    }

    public static String hashtagName(String str) {
        String[] names = str.split(" ");
        
        String x ="#";
        if(names.length == 1) return "#" + names[0];
        return x.concat(names[names.length - 1] + names[0]);
    }

    public static String upperCaseAllVowel(String str) {
        String[] str1 = str.split(" ");
        String result = "";

        for (int i = 0; i < str1.length; i++) {
            
            for (int j = 0; j < str1[i].length(); j++) {
                char x = str1[i].charAt(j);
                if (x == 'u' || x == 'e' || x == 'o' || x == 'a' || x == 'i') {
                    str1[i] = str1[i].substring(0, j) + str1[i].substring(j, j + 1).toUpperCase() + str1[i].substring(j + 1);
                    
                }
            }
            result = result + str1[i] + " ";
        }
        return result;
    }

    public static String upperCaseAllN(String str) {
        String[] st1 = str.split(" ");
        String result = "";
        for (int i = 0; i < st1.length; i++) {
            for(int j = 0; j < st1[i].length(); j ++) {
                if (st1[i].charAt(j) == 'n') {
                    st1[i] = st1[i].substring(0, j) + st1[i].substring(j, j +1).toUpperCase() + st1[i].substring(j +1);
                }
            }
            result = result + st1[i] + " "; 
        }
        return result;
    }
    
    public static int countWord(String str) {
        String[] result = str.split("\\W+");
        // for (int i = 0; i < result.length; i++) {
        //     System.out.printf("%d , %s%n", i, result[i]);
        // }
        return result.length;
    }  

    public static int countSentences(String paragraph) {
        int count = 0;
        char x = '.';
        for (int i = 0; i < paragraph.length(); i++) {
            if (paragraph.charAt(i) == x) {
                count ++;
            }
        }
        return count;
    }

    public static int countAppear(String paragraph, String word) {
        String x = paragraph.toLowerCase();
        String[] para = x.split("\\W+");
        int count = 0;
        for(int i = 0; i < para.length; i++) {
            System.out.printf("%d, %s%n", i,para[i]);
            if (para[i].equals(word)) {
                count++;
            }
        }
        return count;

    }
}
