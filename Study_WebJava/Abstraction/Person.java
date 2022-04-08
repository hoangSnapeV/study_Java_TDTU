package Study_WebJava.Abstraction;

public abstract class Person {
    private String name;
    private String address;

    protected Person(String name, String address) {
        this.name = name;
        this.address = address;
    }
    public abstract void display();
     
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return address;
    }
    
}
