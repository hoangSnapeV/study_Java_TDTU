package Practice_TDTU.revision_mid_term;

import javax.lang.model.util.ElementScanner14;

public class Rectangle{
    private String name;
    private String color;
    private double width;
    private double length;

    public Rectangle(String name, String color, double width, double length){
        this.setName(name);
        this.setColor(color);
        this.setWidth(width);
        this.setLength(length);
    }

    public String getName(){
        
        return name;
    }

    public String getColor(){
        
        return color;
    }

    public double getWidth(){
        
        return width;
    }
    public double getLength(){
        
        return length;
    }

    public void setName(String name){
        this.name = name;   
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public void setLength(double length){
        this.length = length;
    }

    public double getPerimeter(){
        
        return (width + length) * 2;
    }

    public String getType(){
        double area = width * length;

        if (area >= 10) {
            return "A";
        } else if (area >= 5) {
            return "B";
        } 
            
        return "C";
        
    }
	
	public boolean isSquare(){
        if (length == width ) {
            return true;
        }
        return false;
    }

    public double calDiagonalLine(){
        
        return Math.sqrt(width * width + length * length);
    }

    public Rectangle resize(double rate){
        Rectangle rc = new Rectangle(name, color, this.width *rate , this.length * rate);
        return rc;
    }
    @Override
    public String toString(){
        
        // return "Rectangle[" + name + ", " + length + ", " + width + ", " + length * width + " , " + getType() +"]" ;
        
        return String.format("Rectangle[%s, %.2f, %.3f, %.2f, %s]", name, length, width, length * width, getType());
    }
}