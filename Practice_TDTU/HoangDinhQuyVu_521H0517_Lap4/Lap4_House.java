package Practice_TDTU.HoangDinhQuyVu_521H0517_Lap4;



public class Lap4_House {
   
    private String houseCode;
    private int numOfBedRooms;
    private boolean hasSwimmingPool;
    private double area;
    private double costPerSquareMeter;

    
    public void setHouseCode(String houseCode) {
        this.houseCode = houseCode;
    }
    public void setNumOfBedRooms(int numOfBedRooms) {
        this.numOfBedRooms = numOfBedRooms;
    }

    public void setHasSwimmingPool(boolean hasSwimmingPool) {
        this.hasSwimmingPool = hasSwimmingPool;
    }

    public void setArea(double area) {
        this.area = area;
    }
    public void setCostPerSquareMeter(double costPerSquareMeter) {
        this.costPerSquareMeter = costPerSquareMeter;
    }
    /////////
    public String getHouseCode() {
        return houseCode;
    }
    public int getNumOfBedRooms() {
        return numOfBedRooms;

    }
    public boolean getHasSwimmingPool() {
        return hasSwimmingPool;
    }
    public double getArea() {
        return area;
    }
    public double getCostPerSquareMeter() {
        return costPerSquareMeter;
    }
    //
    public Lap4_House() {
        this("A01", 2, false, 0.0f, 0.0f);
    }
    public Lap4_House(String houseCode, int numOfBedRooms, boolean hasSwimmingPool, double area, double costPerSquareMeter) {
        this.setHouseCode(houseCode);
        this.setNumOfBedRooms(numOfBedRooms);
        this.setHasSwimmingPool(hasSwimmingPool);
        this.setArea(area);
        this.setCostPerSquareMeter(costPerSquareMeter);
    }
    public double calculateSellingPrice() {
    
        double subTotal = area * costPerSquareMeter;
        if (hasSwimmingPool) {
            subTotal = subTotal + subTotal * 0.1;
        } 
        double sellingPrice = subTotal + subTotal * 0.15;

        return sellingPrice;
    }

    @Override 
    public String toString() {
        // return "House[" + houseCode + ", " + numOfBedRooms + ", " + hasSwimmingPool + ", " +  f1.format(calculateSellingPrice()) +"]"; 
        return String.format("House[%s, %d, %s, %f] ", houseCode, numOfBedRooms, hasSwimmingPool, calculateSellingPrice());
    }
}
