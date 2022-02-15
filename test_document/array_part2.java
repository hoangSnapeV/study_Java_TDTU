package test_document;



public class array_part2 {
    public static void main(String[] args) {
        // double[] mylist = {1.9, 2.9, 3.4, 3.5};

        // for (int i = 0; i < mylist.length; i++) {
        //     System.out.println(mylist[i] + " ");
        // }

        // double total = 0;
        // for (int i = 0; i < mylist.length; i++) {
        //     total += mylist[i];

        // }
        // System.out.println("Total is " + total);
        // System.out.println("length is " + mylist.length);
        // double max = mylist[0];
        // for (int i = 0; i < mylist.length; i++) {
        //     if(mylist[i] > max) max = mylist[i];
        // }

        // System.out.println("max is " + max);
        
        // for (double d : mylist) {
        //     System.out.println(d);
        // }
        int[] arr = {3, 2, 1, 4, 5, 27};
        printArray(arr);
        //printArray(new int[]{3, 2, 1, 4, 5, 7});
    }
    ///create func
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
    }

    
}
