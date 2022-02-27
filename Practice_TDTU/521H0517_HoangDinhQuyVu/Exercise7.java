package Practice_TDTU.Lap1;

import java.util.Scanner;


public class Exercise7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char a;
        System.out.print("enter, ki tu: ");
        a = sc.next().charAt(0);
        checkAlphameric(a);
        

    }

    public static void checkAlphameric(char a) {

        if ('A' <= a && a <= 'Z' || 'a' <= a && a <= 'z' || '0' <= a && a <= '9' ) {
            System.out.println("It's alphameric");
        } else System.out.println("It's not alphameric");
        
    }
}
