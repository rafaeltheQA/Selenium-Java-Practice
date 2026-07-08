package polymorphism;

public class Shape
{
    // Area of Circle
    public void area(double radius)
    {
        double circleArea = Math.PI * radius * radius;

        System.out.println("Area of Circle: " + circleArea);
    }

    // Area of Rectangle
    public void area(double length, double breadth)
    {
        double rectangleArea = length * breadth;

        System.out.println("Area of Rectangle: " + rectangleArea);
    }

    public static void main(String[] args)
    {
        Shape s1 = new Shape();

        s1.area(5);

        s1.area(10, 20);
    }
}