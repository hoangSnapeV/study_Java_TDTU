package lap_1;

public class Cau6 {
    public static void main(String[] args) {
        boolean result = checkEvenOdd(33);

        if (result) {
            System.out.println("Even");
        } else System.out.println("Odd");

    }

    public static boolean checkEvenOdd(int n) {
        if (n % 2 == 0) {
            return true;
        }

        return false;
    }
}
