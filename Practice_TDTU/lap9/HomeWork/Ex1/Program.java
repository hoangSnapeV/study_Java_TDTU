import java.io.File;

public class Program{

    // public static Boolean checkFileExist(String name) {
    //     File f = new File(name);
    //     if (f.isAbsolute()) {
    //         return true;
    //     }
    //     return false;
    // }
    public static void checkPathName(String name) {
        
        
        try {
            File f = new File(name);
            if (f.isAbsolute()) {
                System.out.println("The path is absolute");
            } else {
                System.out.println("The path is not absolute");
            }
            
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        
    }

    public static void main(String[] args) {
        //System.out.println(checkFileExist("input.txt")); 

        checkPathName("input.txt");
        checkPathName("C:\\Users\\Admin\\OneDrive\\Desktop\\study_Java_TDTU\\Practice_TDTU\\lap9\\HomeWork\\Ex1");

    }
}