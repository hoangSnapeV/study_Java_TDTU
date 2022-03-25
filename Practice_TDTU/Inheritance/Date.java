package Practice_TDTU.Inheritance;

public class Date {
    private int day;
    private int month;
    private int year;

    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        this.day = day;
    }
    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public void setDate(int day, int month, int year) {
        this.setDay(day);
        this.setMonth(month);
        this.setYear(year);
    }

    public Date(int day, int month, int year) {
        this.setDay(day);
        this.setMonth(month);
        this.setYear(year);
    }

    @Override
    public String toString() {
        if (day < 10 && month < 10) {
            
            return "0" + day + "/ 0" + month + "/ " + year;
            
        } 
        if (day >= 10 && month >= 10) {
            return  day + "/ " + month + "/ " + year;
        } 
        if (day >= 10 && month < 10) {
            return  day + "/ 0" + month + "/ " + year;
        } 

        return  "0" + day + "/ " + month + "/ " + year;
    } 

}




