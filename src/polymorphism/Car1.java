package polymorphism;

public class Car1 extends Car
{
	public void login()
	{
		System.out.println("Start Engine");
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Car1 cl = new Car1();
		cl.login();
	}

}
