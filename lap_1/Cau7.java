package lap_1;

import java.util.Scanner;

public class Cau7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String kt = sc.nextLine();

        boolean result = kt.matches("^[a-zA-Z0-9]*$");

        if (result) {
            System.out.println("Is Alphanumeric");
        } else System.out.println("Is not Alphanumeric");

    }



}
