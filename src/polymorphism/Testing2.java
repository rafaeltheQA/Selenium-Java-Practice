package polymorphism;

public class Testing2 extends Testing1
{
    @Override
    public void login()
    {
        System.out.println("Welcome to my world");
    }

    public static void main(String[] args)
    {
        Testing2 t2 = new Testing2();

        t2.login();
    }
}