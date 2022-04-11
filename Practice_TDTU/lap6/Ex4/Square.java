package Practice_TDTU.lap6.Ex4;

public class Square extends Rectangle {
    private double side;
    public Square() {
        super();
        this.side = 1.0;
    }
    public Square(double side) {
        super();
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        super.setColor(color);
        super.setFilled(filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side = side;
    }
    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }
    @Override
    public void setLength(double length) {
        super.setLength(length);
    }
    @Override 
    public String toString() {
        return "Square[" + side + ", "+ color + ", " + filled + "]";
    }


}
