public class Program {
    public static void main(String[] args) {
        Calculator myCalc = new Calculator();

        System.out.println(myCalc.multiply(3, 5));
        System.out.println(myCalc.divide(3, 0));
        
    }
}
