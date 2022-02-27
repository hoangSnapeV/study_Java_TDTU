package Practice_TDTU.Lap1;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap vao 1 nam: ");
        int year = sc.nextInt();

        boolean result = checkLeapYear(year);

        if (result) {
            System.out.println("It's leap year");
        } else  
            {
                System.out.println("It's not leap year");
            }
        
    }

    public static Boolean checkLeapYear(int n) {
        if (n % 400 == 0) {
            return true;
        }
        else if(n % 4 == 0 && n % 100 != 0) {
            return true;
        } else {
            return false;
        }
            
        
    }
}
