package Practice_TDTU.revision_mid_term;

import java.util.Arrays;

public class lap3_again {
    public static void main(String[] args) {

        int[] arr_1 = new int[] {1, 2, 4, 3};
        System.out.print("Exercise 1.2: ");
        printArray(insertElement(arr_1, 5, 2));

        int[] arr2 = new int[] {1, 3, 1, 3, 2, 4, 5, 6, 1, 3, 2, 7};
        System.out.print("Exercise 1.3: ");
        printArray(findDuplicate(arr2));

        System.out.print("Exercise 1.4: ");
        printArray(removeDuplicate(arr2));
        //

        System.out.print("Exercise 3.1: ");
        String name = "Nguyen Van Chien";
        System.out.print(firstAndLastName(name));

        System.out.print("\nExercise 3.2: ");
        String name2 = "Nguyen Thi Thu Thao";
        System.out.println("'" + middleName(name2) + "'");

        System.out.print("Exercise 3.3: ");
        String name3 = "nguyen van chien vu";
        System.out.println(capitalizeAll(name3));

        System.out.print("Exercise 3.4: ");
        System.out.println(upVowAndLowCon(name)); 
    }

    /* Return the first name and last name, except the middle name. (Ex: Nguyen Van Chien → Nguyen Chien)
    • Return the middle name. (Ex: Nguyen Thi Thu Thao → Thi Thu)
    • Capitalize the full name. (Ex: nguyen van chien → Nguyen Van Chien)
    • Uppercase all vowels and lowercase all consonants. (Ex: Nguyen Van Chien → ngUyEn
    vAn chIEn) */

    /* Write a function to remove the first specific element from an array and return true, if the
    element does not exist in an array return false.
    • Write a function to insert an element a specific position into an array. (After insertion you
    can replace the last element with the element before) (Ex: a = [1,2,4,3] insert 5 at position 2
    → [1,2,5,4])
    • Write a function to find the duplicate values of an array of integer values. (Ex: a =
    [1,3,1,3,2,4] → [1,3])
    • Write a function to remove the duplicate values of an array of integer values. (Ex: a =
    [1,3,1,3,2,4] → [1,3,2,4])

    
    
    */

    public static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    //Exercise 1
    public static int[] insertElement(int[] arr, int x, int position) {
        int[] newArray = new int[arr.length];
        int index = 0;
        for (int i = 0; i <= position; i++) {
            if (i != position) {
                newArray[index] = arr[i];
                index++;
            } else
                {
                    newArray[index] = x;
                    index++;
                }
        }

        for (int j = position; j < arr.length - 1; j++) {
            newArray[index] = arr[j];
            index++;
        }
        return newArray;
    }

    //1.3
    public static int[] findDuplicate(int[] arr) {
        int[] temp = new int[arr.length];
        int index = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                   temp[index] = arr[i];
                   index++; 
                }
            }
        }
        int[] result = Arrays.copyOf(temp, index);
        
        return result;
    }

    //
    
    //
    public static int[] removeDuplicate(int[] arr) {
        int[] result = findDuplicate(arr);

        int[] temp = new int[arr.length];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = 0;
        }
        int count = 0;
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (result[i] == arr[j]) {
                    
                    if (count > 0) {
                        temp[j] = 1;
                        
                    }
                    count++;
                }
            }
            count = 0;
        }
        int[] afterRemove = new int[arr.length];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (temp[i] == 0) {
                afterRemove[index] = arr[i];
                index++;
            }
        }

        int[] result1 = Arrays.copyOf(afterRemove, index);
        return result1;
    }

    ///Exercise 3

    public static String firstAndLastName(String name) {
        String[] names = name.split(" ");
        return names[0] + " " + names[names.length -1];
    } 
    public static String middleName(String name) {
        String[] names = name.split(" ");
        String result = "";

        for (int i = 1; i < names.length - 1; i++) {
            if (i != names.length -2) {
                result += names[i] + " ";
            } else result += names[i];
        }
        return result;
    }
    //
    public static String capitalizeAll(String name) {
        String[] names = name.split(" ");

        StringBuilder bld = new StringBuilder();
        for (int i = 0; i < names.length; i++) {
            String x = names[i].substring(0, 1).toUpperCase() + names[i].substring(1) + " ";
            bld.append(x);
        }

        
        return bld.toString();
    }

    //
    public static String upVowAndLowCon(String name) {
        char u = 'u', e = 'e', o ='o' , a = 'a', i = 'i';

        name = name.toLowerCase();
        String newName = name;
        for (int j = 0; j < name.length(); j++) {
            char x = newName.charAt(j);
            if (x == u || x == e || x == o || x == a || x == i) {
                newName = newName.substring(0, j) + newName.substring(j, j+ 1).toUpperCase() + newName.substring(j + 1); 
            }
        }
        return newName;

    }
    
}
