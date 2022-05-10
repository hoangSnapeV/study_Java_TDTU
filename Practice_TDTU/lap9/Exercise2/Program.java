import  java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;


public class Program {

    public static ArrayList<String> readFile(String fileName) {
        
        File input = new File(fileName);
        ArrayList<String> myList = new ArrayList<String>();

        try {
            Scanner sc = new Scanner(input);

            //String line = sc.nextLine();

            while(sc.hasNextLine()) {
                String line = sc.nextLine();
                myList.add(line);
            }

            sc.close();
        } catch (Exception e) {
            return null;
        }

        return myList;
    }

    public static void writeFile(ArrayList<String> data, String fileName) {
        
        try {
            FileWriter writer = new FileWriter(fileName);

            for(String s : data) {
                writer.write(s.toUpperCase());
                writer.write(System.lineSeparator());
            }

            writer.close();
        } catch (Exception e) {
            
        }
    }

    public static void main(String[] args) {
        ArrayList<String> result = readFile("input.txt");

        writeFile(result, "output.txt");


        // if (result == null) {
        //     System.out.println("No data found");
        //     return;
        // } 

        // for (String s : result) {
        //     System.out.println(s);
        // }
    }
}
