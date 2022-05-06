package Exercise1;

public class Student extends Person{
    private String id;
    private double score;
    
    public Student() {
        super();
        this.id = "1";
        this.score = 10;
    }
    public Student(String name, int birthYear, String id, double score) {
        super(name, birthYear);
        this.id = id; 
        this.score = score;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }
    public void setScore(double score) {
        this.score = score;
    }
    public double getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Student[" + super.toString() + ", " + id + ", " + score + "]";
    }
}
