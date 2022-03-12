package Study_WebJava.Employee_Practice;

import java.io.FileReader;

public class Employee {
    private int id;
    private String firstName;   
    private String lastName;
    private int salary;
    
    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    //
    public void setId(int id) {
        this.id = id;
    }
    public void setFirstName(String firstname) {
        this.firstName = firstname;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    //
    public int getId() {
        return id;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getFullName() {
        return firstName + " " + lastName;
    }
    public int getSalary() {
        return salary;
    }
}
