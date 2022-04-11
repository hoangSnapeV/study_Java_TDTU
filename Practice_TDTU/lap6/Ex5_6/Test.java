package Practice_TDTU.lap6.Ex5_6;

public class Test {
    public static void main(String[] args) {
        Employee e = new Employee();
        System.out.println(e.getCoefficientsSalary() + " " + e.getYearJoined());
        
        System.out.println(e.considerEmulation());

        ///
        Manager mn = new Manager("12", "Hoang vu", 1.0 , "manager", 2000 );
        System.out.println(mn.considerEmulation());
    }
}
