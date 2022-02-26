package Practice_TDTU.Lap1;

public class Exercise9 { 

    public static void main(String[] args) {
        int n = 7;
        hailstoneSequence(n);
    }

    public static void hailstoneSequence(int n) {
        while (n != 1) {
            if (n % 2 == 1) {
                System.out.printf("%d is odd, so we take 3 * n + 1: %d%n", n, n * 3 + 1);
                n = n * 3 + 1;
                
            } else 
                {
                    System.out.printf("%d is even, so we take n / 2: %d%n", n, n / 2);
                    n = n / 2;
                }
        }
    }
}
