package HomeWorkInSlide.Abs1;

public class Dog extends Animals{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("woof");
    }

    public void greets(Dog another) {
        System.out.println("wioooof");
    }
}
