package Exercise1;

public class Employee extends Person {
    private String id;
    private double salary;

    public Employee() {
        super();
        this.id = "1";
        this.salary = 100000; 
    }
    public Employee(String name, int birthYear,String id, double salary) {
        super();
        this.id = id;
        this.salary = salary;
    }

     
    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }
    @Override
    public String toString() {
        return "Employee[" + super.toString() + ", " + id + ", " + salary + "]"; 
    }

}
