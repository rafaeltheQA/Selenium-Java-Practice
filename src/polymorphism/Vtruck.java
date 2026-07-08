package polymorphism;

public class Vtruck extends Vehicle
{
	@Override
	public void speed()
	{
		System.out.println("I have to drive very slow because I drive a truck.");
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Vtruck vt1 = new Vtruck();
		vt1.speed();
	}

}
