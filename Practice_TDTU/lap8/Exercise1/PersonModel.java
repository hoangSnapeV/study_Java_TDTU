package Exercise1;

import java.util.ArrayList;

public class PersonModel <T> {
    private ArrayList<T> a1 = new ArrayList<T>();

    public void add(T obj) {
        a1.add(obj);
    }

    public void display() {
        for(T obj : a1) {
            System.out.println(obj);
        }
    }

    public static void main(String[] args)  {
        PersonModel<Student> model1 = new PersonModel<Student>();
        PersonModel<Student> model2 = new PersonModel<Student>();


        Student s1 = new Student("Vu", 2003, "2", 20000.2);
        model1.add(s1);

        model2.add(new Student("Thinh", 2000, "23", 100000));

        model1.display();
        model2.display();
        System.out.println();
        ///
        PersonModel<Employee> e3 = new PersonModel<Employee>();
        PersonModel<Employee> e4 = new PersonModel<Employee>();
        //Employee(String name, int birthYear,String id, double salary)
        e3.add(new Employee("Tuan", 203, "22", 2000));
        e4.add(new Employee("Tram", 2203, "23", 20044));

        e3.display();
        e4.display();

        System.out.println();
        //
        PersonModel<Person> p1 = new PersonModel<Person>();
        PersonModel<Person> p2 = new PersonModel<Person>();

        p1.add(new Person());
        p2.add(new Person("Huy", 119));

        p1.display();
        p2.display();


    }
}
 