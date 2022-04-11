package Practice_TDTU.lap6.Ex5_6;
import java.util.Calendar;
public class Employee {
    private String id;
    private String fullName;
    private int yearJoined;
    private double coefficientsSalary;
    private int numberDaysOff;
    private int basicSalary = 1150;

    public Employee() {
        this.id = "0";
        this.fullName = "";
        this.yearJoined = 2020;
        this.coefficientsSalary = 1.0;
        this.numberDaysOff = 0;
    }

    public Employee(String id, String fullName, double coefficientsSalary) {
        this.id = id;
        this.fullName = fullName;
        this.coefficientsSalary = coefficientsSalary;
        this.yearJoined = 2020;
        this.numberDaysOff = 0;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getFullName() {
        return fullName;
    }
    public void setYearJoined(int yearJoined) {
        this.yearJoined = yearJoined;
    }
    public int getYearJoined() {
        return yearJoined;
    }
    public void setCoefficientsSalary(double coefficientsSalary) {
        this.coefficientsSalary = coefficientsSalary;
    }
    public double getCoefficientsSalary() {
        return coefficientsSalary;
    }
    public void setNumberDaysOff(int numberDaysOff) {
        this.numberDaysOff = numberDaysOff;
    }
    public int getNumberDaysOff() {
        return numberDaysOff;
    }

    public double getBasicSalary() {
        return basicSalary;
    }
    //
    public double getSenioritySalary() {
        int year = Calendar.getInstance().get(Calendar.YEAR);
        if (year - yearJoined >= 5) {
            return (year - yearJoined) * basicSalary / 100;
        }
        return 0;
    }

    public String considerEmulation() {
        if (numberDaysOff <= 1) {
            
            return "A";
        } else if (numberDaysOff <= 3) {
            return "B";
        } 
        return "C";   
    }

    public double getEmulation(String x) {
        double emulationCoefficient = 0;
        if (x.equals("A")) {
            emulationCoefficient = 1.0;
        } else if(x.equals("B") ) {
            emulationCoefficient = 0.75;
        } else {
            emulationCoefficient = 0.5;
        }
        return emulationCoefficient;
    }

    public double getSalary() {
        

        double emulationCoefficient = getEmulation(considerEmulation());

        return basicSalary + basicSalary * (coefficientsSalary + emulationCoefficient) + getCoefficientsSalary();
    }

}
