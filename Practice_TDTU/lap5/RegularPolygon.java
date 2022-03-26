package Practice_TDTU.lap5;

public class RegularPolygon {
    private String name;
    private int edgeAmount;
    private double edgeLength;

    public RegularPolygon() {
        this.name = "";
        this.edgeAmount = 3;
        this.edgeLength = 1;

    }

    public RegularPolygon(String name, int edgeAmount, double edgeLength) {
        this.name = name;
        this.edgeAmount = edgeAmount;
        this.edgeLength = edgeLength;
    }

    public RegularPolygon(String name, int edgeAmount) {
        this.name = name;
        this.edgeAmount = edgeAmount;
        this.edgeLength = 1;
    }

    public RegularPolygon(RegularPolygon polygon) {
        this.name = polygon.name;
        this.edgeAmount = polygon.edgeAmount;
        this.edgeLength = polygon.edgeLength;
    }

    public String getName() {
        return name;
    }
    public int getEdgeAmount() {
        return edgeAmount;
    }
    public double getEdgeLength() {
        return edgeLength;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setEdgeAmount(int num) {
        this.edgeAmount = num;
    }
    public void setEdgeAmount(double length) {
        this.edgeLength = length;
    }

    // 
    public String getPolygon() {
        if (getEdgeAmount() == 3) {
            return "Triangle";
        }
        if (getEdgeAmount() == 4) {
            return "Quadrangle";
        }
        if (getEdgeAmount() == 5) {
            return "Pentagon";
        }
        if (getEdgeAmount() == 6) {
            return "Hexagon";
        }
        return "Polygon has the number of edges greater than 6";
    }  

    public double getPerimeter() {
        return edgeLength * edgeAmount;
    }
    public double calculate(double a, double edgeLength) {
        return edgeLength * edgeLength * a;
    }

    public double getArea() {
        double a;
        if(getEdgeAmount() == 3) {
            a = 0.433;
            return calculate(a, edgeLength);
        }
        if(getEdgeAmount() == 4) {
            a = 1;
            return calculate(a, edgeLength);
        }
        if(getEdgeAmount() == 5) {
            a = 1.72;
            return calculate(a, edgeLength);
        }
        if(getEdgeAmount() == 6) {
            a = 2.595;
            return calculate(a, edgeLength);
        }
        return -1;
    }

    @Override
    public String toString() {
        return name + " - " + getPolygon() + " - " + getArea();
    }
}
 