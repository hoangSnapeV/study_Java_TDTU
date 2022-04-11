package Practice_TDTU.lap6.ex2;

public class Test {
    public static void main(String[] args) {
        Person ps = new Person("Vu", "Khu pho lang sim");
        System.out.println(ps.toString());

        Person ps1 = new Student("Yen", "Ho Tram", "Medicine", 2022, 20);
        System.out.println(ps1.toString());
    }
}
