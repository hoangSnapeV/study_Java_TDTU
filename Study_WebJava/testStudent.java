package Study_WebJava;

public class testStudent {
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.display();

        Student s2 = new Student("Quang");
		s2.display();
		Student s3 = new Student('m');
		s3.display();
		Student s4 = new Student("Thu", 'f');
		s4.display();
    }
}
