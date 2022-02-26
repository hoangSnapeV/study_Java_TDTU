package Practice_TDTU.Lap1;

public class Exercise11 {
    public static void main(String[] args) {
        int n = 30330;
        System.out.println("Count number of digits: " + countNumerOfDigit(n));
    }

    public static int countNumerOfDigit(int n) {
        int count = 0;

        while (n > 0) {
            n = n / 10;
            count++;
        }

        return count;
    }
}
