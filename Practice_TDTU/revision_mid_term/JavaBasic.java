package Practice_TDTU.revision_mid_term;


public class JavaBasic {
    public static void main(String[] args) {
        int[] array = {1, 2, -3, -7, -2, -1, 10 , 2};

        System.out.println("a, sum = " + sumNegativeElements(array));

        String x = "nguyen tran anh oanh";
        System.out.println("b, string =" + uppercaseFirstVowels(x));

        int[] a = {2, 1, 2, 3, 0, 4, 5};
        System.out.println("c, Index negative = " + findMinNegativeElement(a));

        String y = "Name: Tran Van Tai";
        System.out.println("d, result = " + getName(y));
        int[] arr1 = {1, 2, 4, 61, 1, -2, 2 , 11};
        System.out.println("e = " + findFirstMod3Element(arr1));

        String z = "Pham Thi Uyen Uyen";
        System.out.println("f = " + countString(z, "uyen"));

    }

    //a
    public static int sumNegativeElements(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                sum += a[i];
            }
        }
        return sum;
    }

    //b 
    public static String uppercaseFirstVowels(String str) {
        String str1 = str.toLowerCase();
        String[] names = str1.split(" ");
        char u = 'u', e = 'e', o = 'o', a ='a', i = 'i';
        String result = "";
        String v;

        for (int j = 0; j < names.length; j++) {
            char x = names[j].charAt(0);
            if (x == u || x == e || x == o || x == a || x == i) {
                v = names[j].substring(0, 1).toUpperCase() + names[j].substring(1) + " ";
                result = result.concat(v);
            }
            else {
                result = result.concat(names[j] + " ");
            }
           
        }
        // String newString = "";
        // for (int j = 0; j < names.length; j++) {
        //     newString += names[j];
        // }
        return result;
    }

    //c
    public static int findMinNegativeElement(int[] a) {
        int min = a[0];
        int index = 0 ;
        for (int i = 1; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
                index = i;
            }
        }
        if (min >= 0) {
            index = -1;
        }
        return index;
    }
    //d
    public static String getName(String str) {
        String[] names = str.split(": ");
        return names[1];
    }

    //e
    public static int findFirstMod3Element(int[] a){
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 3 == 0) {
                return i;
            }
        }
        return -1;
    }

    public static int countString(String str, String k) {
        String str1 = str.toLowerCase();
        String[] name = str1.split(" ");
        int count = 0;

        k = k.toLowerCase();
        for (int i = 0; i < name.length; i++) {
            if (name[i].equals(k)) {
                count++;
            }
        }
        return count;

    }
}


