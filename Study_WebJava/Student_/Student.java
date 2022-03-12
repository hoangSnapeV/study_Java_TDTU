package Study_WebJava.Student_;

class Student {
    private int id;
    private String name;
    private int age;
    private String address;
    private int score;
    
    public Student() {

    }

    public Student(int id, String name, int age, String address, int score) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.score = score;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    //
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    //
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    //
    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return address;
    }
    //
    public void setScore(int score) {
        if (score < 0) {
            this.score = 0;
        } else if (score > 10) {
            this.score = 10;
        } else {
            this.score = score;
        }
    }
    public int getScore() {
        return score;
    }
    



}
