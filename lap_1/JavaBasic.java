
public class JavaBasic{
    public static int sumNegativeElements(int arr[]){
        int sum = 0;
        for (int i=0; i<arr.length;i++)
        {
            if (arr[i]<0)
            {  
                sum = sum + arr[i];

            }
        }
        return sum;
    }

    public static String uppercaseFirstVowels(String str){
        



        return "";
    }

    public static int findMinNegativeElement(int a[]){
        int min = a[0]; 

        for(int i=1; i<a.length;i++)
        {
            if(a[i]<0 && min>a[i])
            {
                min = a[i];
            }
        }
        if (min >= 0)
            return -1;
        return min;
    }

    public static String getName(String str){
        String[] t = str.split(": "); 
            return t[1]; 
    }

    public static int findFirstMod3Element(int[] a){
        
        for (int i=0; i<a.length; i++)
        if(a[i]% 3 == 0)
        {
            return a[i];
        }

        return -1;
    }

    public static int countString(String str, String k)
    {  
        str = str.toLowerCase();
        k = k.toLowerCase();
        String[] word =  str.split(" ");
        int count = 0;
        for(int i = 0; i < word.length; i++)
        {
            if(word[i].equals(k))
            {
                count ++;  
            }
        }
        return count;
    }

    public static void main(String[] args){
        int a[] = {1,-2,3,4,-2,1,-9};
        String s = "nguyen thi uyen an";
        String s1 = " Le Thi Thu Thao:";
        String s2 = "Nguyen Thi Oanh Oanh"; // 1. lowercase 2. uppercase //oanh2
        System.out.println("Sum = " + sumNegativeElements(a));
        System.out.println("Min = " + findMinNegativeElement(a));
        System.out.println(" find First Mod 3 Element = " + findFirstMod3Element(a));
        
        System.out.println(countString(s2,"OaNh")); 


    }
}