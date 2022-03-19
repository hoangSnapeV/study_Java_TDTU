package Practice_TDTU.HoangDinhQuyVu_521H0517_Lap4;

public class Lap4_Student {
    private int id;
    private String firstName;
    private String lastName;

    public Lap4_Student(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;

    }
    public int getId() {
        return id;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    //
    public void setId(int id) {
        this.id = id;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    //
    public String getName() {
        return firstName + " " + lastName;
    }
    @Override
    public String toString() {
        return "Student[" + id + ", " + firstName + ", " + lastName + "]";
    }

}
