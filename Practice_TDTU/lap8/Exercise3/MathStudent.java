public class MathStudent extends Student{
    private String id;
    public MathStudent(String id) {
        super();
        this.id = id;
    }
    public MathStudent(String name, double gpa, String id) {
        super(name, gpa);
        this.id = id;
    }

    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    
    @Override
    public String getRank() {
        if (super.getGpa() >= 5) {
            return "Passed";
        }
        return "Failed";
    }
}
