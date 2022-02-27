package HomeWorkInSlide;

import java.util.StringTokenizer;

public class ExampleStringToke {
    public static void main(String[] args) {
        String a = "Nguyen Van Teo";
        StringBuffer sb = new StringBuffer(a);
        StringTokenizer st = new StringTokenizer(a, " ");

        int len = sb.length();
        System.out.println(len);

        int numberOfToken = st.countTokens();
        System.out.println("len = " + numberOfToken);
        //cau 2

        
        for (int i = 0; i < numberOfToken; i++) {
            if (i == 0) {
                System.out.println("");
            }
        }


        firstName(st);
        lastName(st);
    }

    public static void firstName(StringTokenizer a) {
        System.out.println("First name: " + a.nextToken());
       
    }
    public static void lastName(StringTokenizer a) {

        String lastToken = null;
        while (a.hasMoreTokens()) {
            
            lastToken = a.nextToken();
        }
        System.out.println("Last name: " + lastToken);
        
    }



}


