package Study_WebJava;

public class main {
    public static void main(String[] args) {
        int[] arr1 = new int[] {3, 4, 2};
        double[] arr2 = new double[] {1.3, 4.2, 3.6};

        System.out.println(ArrayCalculator.minOfArray(arr1));
		System.out.println(ArrayCalculator.minOfArray(arr2));
		System.out.println(ArrayCalculator.maxOfArray(arr1));
		System.out.println(ArrayCalculator.maxOfArray(arr2));
    }
}
