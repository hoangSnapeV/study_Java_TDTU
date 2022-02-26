package Practice_TDTU;

import java.util.Scanner;

public class EnterInformaiton {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter, name: ");
        String name = sc.nextLine();
        System.out.print("Enter, age: ");
        int age = sc.nextInt();

        System.out.println("Name: " + name + " Age: " + age);
        
    }
}
