package HomeWorkInSlide.Abstraction;

public class Test {
    public static void main(String[] args) {
        Employee e = new FullTimeEmployee("Vu", 20000, 12);
        System.out.println(e.calculateSalary());
    }
}
