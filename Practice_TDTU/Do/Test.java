public class Test {
    public static void main(String[] args) {

        Circle c1 = new Circle(); // no parameter 

        System.out.println(c1.getRadius()); 
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getArea());
        System.out.println(c1);

        //
        System.out.println();
        Circle c2 = new Circle(8); //have radius parameter
        System.out.println(c2.getPerimeter());
        System.out.println(c2.getArea());
        System.out.println(c2);
        //
        System.out.println();
        //
        ResizableCircle r1 = new ResizableCircle(3);
        System.out.println(r1.getRadius());
        System.out.println(r1.getPerimeter());
        System.out.println(r1.getArea());

        r1.resize(50);
        System.out.println(r1.getRadius());
        System.out.println(r1.getPerimeter());
        System.out.println(r1.getArea());
        // 

        ResizableCircle r2 = new ResizableCircle();
        System.out.println(r2);
    }
} 
