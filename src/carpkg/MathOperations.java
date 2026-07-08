package carpkg;

public class MathOperations {

    public int square(int num)
    {
        return num * num;
    }

    public int cube(int num)
    {
        return num * num * num;
    }

    public boolean isEven(int num)
    {
        return num % 2 == 0;
    }

    public static void main(String[] args) {

        MathOperations math1 = new MathOperations();

        System.out.println(math1.square(20));
        System.out.println(math1.cube(20));
        System.out.println(math1.isEven(20));

    }

}