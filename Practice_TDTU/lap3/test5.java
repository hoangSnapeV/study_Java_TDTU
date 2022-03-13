package Practice_TDTU.lap3;
import java.util.Scanner;
import java.util.StringTokenizer;


public class test5 {
    

public class Countword {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = "You are living on a Plane. What you style Flatland is the vast level surface of what I may call a fluid, on, or in, the top of which you and your countrymen move about, without rising above it or falling below it";
        String[] words = a.split("\\W+");
        int[] n = new int[words.length];
        for (int i = 0; i < n.length; i++) {
            n[i] = 0;
        }
        String[] temp = new String[words.length];

        int indexTemp = 0;
        for (int i = 0; i < words.length; i++) {
            boolean exit = false;


            for (int j = 0; j < indexTemp; j++) {
                if (words[i].toLowerCase().equals(temp[j].toLowerCase())) {
                    exit = true;
                    n[i] += 1;
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
            System.out.print(": "+ n[i]);
            System.out.println();
        }
        System.out.println(indexTemp);
    }
}
}

/*/lap5.3 
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

    } */
