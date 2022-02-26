package Practice_TDTU.Lap1;
import java.util.Scanner;
public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();

        
        System.out.println("Remainder n / x = " + remainderOfDivision(n, x));

    }

    public static int remainderOfDivision(int n, int x) {
        int result = n / x;

        result = n - result * x;
        return result;
    }
}
