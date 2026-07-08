

package methodoverloading;

public class Calculator 
{
    int num1 = 10;
    int num2 = 20;
    double num3 = 15.5;

    public int calculate(int num1, int num2) 
    {
        return num1 + num2;
    }

    public double calculate(int num2, double num3) 
    {
        return num2 + num3;
    }

    public double calculate(double num3, int num1) 
    {
        return num3 + num1;
    }

    public static void main(String[] args)
    {
        Calculator c1 = new Calculator();

        System.out.println(c1.calculate(10, 20));
        System.out.println(c1.calculate(20, 15.5));
        System.out.println(c1.calculate(15.5, 10));
    }
}