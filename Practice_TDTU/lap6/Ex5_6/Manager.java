package Practice_TDTU.lap6.Ex5_6;

public class Manager extends Employee{
    private String position;
    private int department;
    private double salaryCoefficientPosition;

    public Manager() {
        super();
        this.position = "manager";
        super.setCoefficientsSalary(5.0);
    }

    public Manager(String id, String fullName,  double coefficientsSalary, String position, double salaryCoefficientPosition) {
        super(id, fullName, coefficientsSalary);
        this.position = position;
        this.salaryCoefficientPosition = salaryCoefficientPosition;
    }

    public Manager(String id, String fullName,  double coefficientsSalary, String position, double salaryCoefficientPosition, int department) {
        super(id, fullName, coefficientsSalary);
        this.position = position;
        this.salaryCoefficientPosition = salaryCoefficientPosition;
        this.department = department;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public void setDepartment(int department) {
        this.department = department;
    }
    public void setSalaryCoefficientPosition(double salaryCoefficientPosition) {
        this.salaryCoefficientPosition = salaryCoefficientPosition;
    }
    public String getPosition() {
        return position;
    }
    public int getDepartment() {
        return department;
    }
    public double getSalaryCoefficientPosition() {
        return salaryCoefficientPosition;
    }

    @Override 
    public String considerEmulation() {
        return "A";
    }
    public double bonusByPosition() {
        return super.getBasicSalary() * salaryCoefficientPosition;
    }
    @Override
    public double getSalary() {
        return super.getBasicSalary() + super.getBasicSalary() * (super.getCoefficientsSalary() + super.getEmulation(considerEmulation())) + super.getSenioritySalary() + this.bonusByPosition();
    }
}
