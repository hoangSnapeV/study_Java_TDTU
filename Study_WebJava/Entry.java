package Study_WebJava;

class Person{
	private int id;
	private String name;
	private int age;
	private String address;

	public Person(int id, String name, int age, String address) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getAddress() {
		return address;
	}

	
}

class Person1 {
	private int id;
	private String name;
	private int age;
	private String address;

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

	
}
public class Entry {
	public static void main(String[] args) {
		Person p = new Person(1001, "Quynh", 24, "Hanoi");

		System.out.println("Id: " + p.getId());
		System.out.println("Name: " + p.getName());
		System.out.println("Age: " + p.getAge());
		System.out.println("Address: " + p.getAddress());
	}
}
