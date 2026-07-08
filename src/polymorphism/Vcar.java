package polymorphism;

public class Vcar extends Vehicle
{
	@Override
	public void speed()
	{
	System.out.println("Car is going too slow");
}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Vcar vc1 = new Vcar();
		vc1.speed();
	}

}
