public class Test {
    public static void main(String[] args) {
        Circle c1 = new Circle(7);

        ResizableCircle c2 = new ResizableCircle(10);
        c2.resize(50);
        System.out.println(c1);
        System.out.println(c2);
    }
}
