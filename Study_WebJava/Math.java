package Study_WebJava;

class Math {
    static double PI = 3.14;

    public static int abs(int x) {
        return x * x;
    }

    public static int add(int x, int y) {
        return x + y;
    }

    public static int subtract(int x, int y) {
        return x - y;
    }

    public static int min(int x, int y) {
        if (x > y) {
            return y;
        }
        return x;
    }
    public static int max(int x, int y) {
        if (x < y) {
            return y;
        }
        return x;
    }
    public static int pow(int x, int y) {
        int result = 1;
        for (int i = 0; i < y; i++) {
            result *= x;
        }
        return result;

    }


}
