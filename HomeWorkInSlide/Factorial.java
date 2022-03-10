package HomeWorkInSlide;

public class Factorial {
    
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.printf("Factorial (%d) = %d\n", n, factorial(n));
        Integer it = new Integer(3);

        System.out.println(it);
    }
}
