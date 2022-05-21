public class Student {
    String name;
    int age;
    double score;
    Address address;
    
    public Student() {
    }

    public Student(String name, int age, double score, Address address) {
        this.name = name;
        this.age = age;
        this.score = score;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    
    @Override
    public String toString() {
        return "Student [address=" + address + ", age=" + age + ", name=" + name + ", score=" + score + "]";
    }
    
}
