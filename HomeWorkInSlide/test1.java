package HomeWorkInSlide;
import java.util.Random;

public class test1 {
    public static void main(String[] args) {

        // To generate a random integer in [51,70]
        tesst1();
        
    }

    public static void tesst1() {
        
        int num1 = (int) (Math.random() * 20) + 51;
        
        System.out.println("num1 = " + num1);
        
        Random rnd = new Random();
        
        int num2 = rnd.nextInt(20) + 51;
        
        System.out.println("num2 = " + num2);
        
    }
}
