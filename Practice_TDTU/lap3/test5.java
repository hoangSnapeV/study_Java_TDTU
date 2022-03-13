package Practice_TDTU.lap3;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;


public class test5 {
    
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
    public static void main(String[] args){

        //Scanner sc = new Scanner(System.in);

        String a = "You are living on a Plane. What you style Flatland is the vast level surface of what I may call a fluid, on, or in, the top of which you and your countrymen move about, without rising above it or falling below it";
        
        String[] words = a.split("\\W+"); // original 
        // for (int i = 0; i < words.length; i++) {
        //     System.out.println(words[i]);
        // }
        //String[] dupl =  findStringDuplicate(words);

        //printString(removeDuplicate(words));
        String[] afterRemove1 = removeDuplicate(words);

        countAppear(afterRemove1, words);
        
        //printString(words);

        // int[] n = new int[words.length];

        // for (int i = 0; i < n.length; i++) {
        //     n[i] = 0;
        // }

        // String[] temp = new String[words.length];
        // int indexTemp = 0;

        // for (int i = 0; i < words.length; i++) {

        //     boolean exit = false;
        //     for (int j = 0; j < indexTemp; j++) {

        //         if (words[i].toLowerCase().equals(temp[j].toLowerCase())) {
        //             exit = true;
        //             n[i] += 1;
        //             continue;
        //         }
        //     }

        //     if (exit == false) {
        //         temp[indexTemp] = words[i];
        //         n[indexTemp] += 1;
        //         indexTemp++;
        //     }
        // }

        // for (int i = 0; i < indexTemp; i++) {
        //     System.out.print(temp[i]);
        //     System.out.print(": "+ n[i]);
        //     System.out.println();
        // }
        // System.out.println(indexTemp);
    }
}
