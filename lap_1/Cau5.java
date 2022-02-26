package lap_1;

public class Cau5 {
    

    public static void main(String[] args) {
        int a = 3000, b = 400, c = 5225;
        System.out.printf("max = %d%n", findMax(a, b, c));
    }

    public static int findMax(int a, int b, int c) {
        int result = a;
        if (b > result) {
            result = b;
        }
        if (c > result) {
            result = c;
        }

        return result;
        
    }
}
