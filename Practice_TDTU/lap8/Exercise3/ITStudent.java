public class ITStudent extends Student {
    private int id;

    public ITStudent(int id) {
        super();
        this.id = id;
    }

    public ITStudent(String name, double gpa, int id) {
        super(name, gpa);
        this.id = id;
    }

    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "ITStudent [" + super.toString() + "id = " + id + "]";
    }
    
    
    @Override
    public String getRank() {
        if (super.getGpa() <= 5) {
            return "C";
        } else if (super.getGpa() <= 8) {
            return "B";
        } 
        return "A";
    }
}
