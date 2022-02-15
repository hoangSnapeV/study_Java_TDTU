package lap_1;
import java.util.Scanner;
public class cau3 {
    
    public static void main(String[] args) {
        double fahrenheit;

        Scanner input = new Scanner(System.in);
        fahrenheit = input.nextDouble();

        double celsius = (5.0 / 9) * (fahrenheit - 32);
        System.out.println("Celsius = " + celsius);
    
    }
}


