package Practice_TDTU.PraticeInClass;

import java.util.Arrays;

public class Test1 {

    public static void main(String[] args) {
    
    // Construct and initialise array
    
    double[] arr = { 35.1, 21, 57.7, 18.3 };
    
    // using the length attribute
    
    System.out.println("Length = " + arr.length);
    
    for (int i=0; i<arr.length; i++) {
    
    System.out.print(arr[i] + " ");
    
    }
    
    System.out.println();
    
    // Alternative way
    
    for (double element: arr) {
    
    System.out.print(element + " ");
    
    }
    
    System.out.println();
    
    System.out.println(Arrays.toString(arr));
    
    }
}