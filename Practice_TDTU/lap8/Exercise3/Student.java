public abstract class Student {
    private String name;
    private double gpa;
    
    public Student() {
        this.name = "Vu";
        this.gpa = 1.0;
    }

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public abstract String getRank();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    
    @Override
    public String toString() {
        
        return "Student[" + name + ", " + gpa + "]";
    }
}