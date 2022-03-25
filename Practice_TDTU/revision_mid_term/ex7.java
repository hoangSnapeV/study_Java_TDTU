package Practice_TDTU.revision_mid_term;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char a;
        System.out.print("Enter, ki tu: ");
        a = sc.next().charAt(0);

    }

    public static void checkAlphameric(char a) {
        if ('A' <= a && a <= 'Z' || 'a' <= a && 'a' <= 'z'|| '0' <= a && a <='9') {
            System.out.println("It's alphameric");
        } else System.out.println("It's not alphameric");
    }

}
