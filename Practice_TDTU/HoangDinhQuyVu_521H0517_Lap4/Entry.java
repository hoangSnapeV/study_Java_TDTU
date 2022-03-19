package Practice_TDTU.HoangDinhQuyVu_521H0517_Lap4;


public class Entry {
    public static void main(String[] args) {
        Lap4_Point2D p1 = new Lap4_Point2D();
        System.out.println(p1.getX());

        Lap4_Point2D p2 = new Lap4_Point2D(3.0f, 4.0f);

        System.out.println(p2.getX() + " " + p2.getY());

        //Exercise2

        Lap4_Rectangle re1 = new Lap4_Rectangle();
        System.out.println(re1.getLength() + " " + re1.getWidth());
        Lap4_Rectangle re2 = new Lap4_Rectangle(3.0f, 4.0f);
        System.out.println(re2.toString());

        //Exercise 3
        Lap4_Student st = new Lap4_Student(5210517, "Hoang", "Vu");
        System.out.println(st.toString());

        //Exercise 4 
        Lap4_House h1 = new Lap4_House();
        System.out.println(h1.getHouseCode() + " " + h1.getNumOfBedRooms() + " " + h1.getHasSwimmingPool());
        
        Lap4_House h2 = new Lap4_House("I0914", 8, true, 100.0f, 2500000.0f);
        System.out.println(h2.toString());

        
        //Exercise 5
        Lap4_Fraction fr1 = new Lap4_Fraction(2 , 4);
        Lap4_Fraction fr2 = new Lap4_Fraction(4, 3);
        Lap4_Fraction result = new Lap4_Fraction();
        result = fr1.sub(fr2);
        System.out.println(result.toString()); 
        result.reducer();
        
        System.out.println(result.toString()); 

    }
}
