public class FullTimeStaff extends Staff {
    protected int baseSalary;
    protected double bonusRate;

    public FullTimeStaff(String sID, String sName, int baseSalary, double bonusRate) {
        super(sID, sName);
        this.baseSalary = baseSalary;
        this.bonusRate = bonusRate;
    }
    
    public int getBaseSalary() {
        return baseSalary;
    }
    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }
    public double getBonusRate() {
        return bonusRate;
    }
    public void setBonusRate(double bonusRate) {
        this.bonusRate = bonusRate;
    }

    @Override
    public double paySalary(int workedDays) {
        if (workedDays > 21) {
            return baseSalary * bonusRate + (workedDays - 21) * 100000;
        }
        return baseSalary * bonusRate;
    }

    @Override
    public String toString() {
        return sID + "_" + sName + "_" + bonusRate + "_" + baseSalary; 
    }
    
}
