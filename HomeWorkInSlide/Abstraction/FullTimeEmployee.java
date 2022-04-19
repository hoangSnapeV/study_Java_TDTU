package HomeWorkInSlide.Abstraction;

public class FullTimeEmployee extends Employee {
    public int workingHours;

    public FullTimeEmployee(String name, int paymentPerHour, int workingHours) {
        super(name, paymentPerHour);
        this.workingHours = workingHours;
    }

    @Override
    public int calculateSalary() {
        return workingHours * super.paymentPerHour;
    }
}
