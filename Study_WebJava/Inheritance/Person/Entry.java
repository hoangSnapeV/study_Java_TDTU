package Study_WebJava.Inheritance.Person;

class Person{
	private String name;
	private int dob;
	public Person(String name, int dob) {
		this.name = name;
		this.dob = dob;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public void setDob(int dob) {
		this.dob = dob;
	}
	public int getDob() {
		return dob;
	}
}

class Student extends Person {
	private double gpa;

	public Student(String name, int dob,double gpa) {
		super(name, dob);
		this.gpa = gpa;
		
		
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	public double getGpa() {
		return gpa;
	}
}

public class Entry {
	public static void main(String[] args) {
		Student s = new Student("Hai", 1999, 8.8);
		System.out.println("Name: " + s.getName());
		System.out.println("Date of birth: " + s.getDob());
		System.out.println("GPA: " + s.getGpa());
	}
}