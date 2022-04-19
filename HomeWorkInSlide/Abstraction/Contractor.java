package HomeWorkInSlide.Abstraction;

public class Contractor extends Employee {
    public int workingHours;

    public Contractor(String name, int paymentPerHour, int workingHours) {
        super(name, paymentPerHour);
        this.workingHours = workingHours;
    }

    @Override
    public int calculateSalary() {
        return workingHours * super.paymentPerHour;
    }
}
