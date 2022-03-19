package Practice_TDTU.HoangDinhQuyVu_521H0517_Lap4;

public class Lap4_Fraction {
    private int numerator;
    private int denominator;

    public Lap4_Fraction() {
        this.numerator = 1;
        this.denominator = 1;
    }
    public Lap4_Fraction(int num, int den) {
        numerator = num;
        denominator = den;

    }
    public Lap4_Fraction(Lap4_Fraction f) {
        this.numerator = f.numerator;
        this.denominator = f.denominator;
    }

    public Lap4_Fraction add(Lap4_Fraction f) {
        Lap4_Fraction answer = new Lap4_Fraction();
        if (this.denominator != f.denominator) {
            answer.numerator = this.numerator * f.denominator + this.denominator * f.numerator;
            answer.denominator = this.denominator * f.denominator;

        } else {
            answer.numerator = this.numerator + f.numerator;
            answer.denominator = this.denominator;
        }
         
        
        return answer;
    }

    public Lap4_Fraction sub(Lap4_Fraction f) {
        Lap4_Fraction answer = new Lap4_Fraction();
        if (this.denominator != f.denominator) {
            answer.numerator = this.numerator * f.denominator - this.denominator * f.numerator;

            answer.denominator = this.denominator * f.denominator;
        } else {
            answer.numerator = this.numerator - f.numerator;
            answer.denominator = this.denominator;
        }
        
        
         
        return answer;
    }

    public Lap4_Fraction mul(Lap4_Fraction f) {
        Lap4_Fraction answer = new Lap4_Fraction();
        answer.numerator = this.numerator * f.numerator;
        answer.denominator = this.denominator * f.denominator;
        return answer;
    }

    public Lap4_Fraction div(Lap4_Fraction f) {
        Lap4_Fraction answer = new Lap4_Fraction();
        answer.numerator = this.numerator * f.denominator;
        answer.denominator = this.denominator * f.numerator;
        return answer;
    }

    public void reducer() {
        int ts = 1;
        for (int i = this.denominator; i > 0; i--) {
            if (this.numerator % i == 0 && this.denominator % i == 0) {
                ts = i;
                break;
            }
        }
        this.numerator /= ts;
        this.denominator /= ts;
    }

    @Override
    public String toString() {
        return String.format("Fraction[%d, %d]", numerator, denominator);
    }
}
/*
public class Fraction 
{
    private int numerator;
    private int denominator;

    public Fraction()
    {
        this.numerator = 1;
        this.denominator = 1;
    }

    public Fraction(int num, int den)
    {
        this.numerator = num;
        this.denominator = den;
    }

    public Fraction(Fraction f)
    {
        this.numerator = f.numerator;
        this.denominator = f.denominator;
    }

    public Fraction add(Fraction f)
    {
        Fraction ans = new Fraction();
        ans.numerator = this.numerator * f.denominator + this.denominator * f.numerator;
        ans.denominator = this.denominator * f.denominator;
        return ans;
    }

    public Fraction sub(Fraction f)
    {
        Fraction ans = new Fraction();
        ans.numerator = this.numerator * f.denominator - this.denominator * f.numerator;
        ans.denominator = this.denominator * f.denominator;
        return ans;
    }

    public Fraction mul(Fraction f)
    {
        Fraction ans = new Fraction();
        ans.numerator = f.numerator * this.numerator;
        ans.denominator = f.denominator * this.denominator;
        return ans;
    }

    public Fraction div(Fraction f)
    {
        Fraction ans = new Fraction();
        ans.numerator = this.numerator * f.denominator;
        ans.denominator = this.denominator * f.numerator;
        return ans;
    }

    public void reducer()
    {
        int ans = 1;
        for (int i = this.denominator; i >= 0; i--)
        {
            if (this.numerator % i == 0 && this.denominator % i == 0)
            {
                ans = i;
                break;
            }
        }
        this.numerator /= ans;
        this.denominator /= ans;
    }

    public String toString()
    {
        return "Fraction[" + numerator + ", " + denominator + "]";
    }

    public static void main(String[] args) 
    {
        Fraction def = new Fraction(100, 123);
        Fraction f = new Fraction(55, 512);

        def = def.add(f);
        def.reducer();
        System.out.println(def.toString());
    }
}
*/