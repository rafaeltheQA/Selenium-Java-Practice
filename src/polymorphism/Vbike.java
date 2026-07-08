package polymorphism;

public class Vbike extends Vehicle
{
	@Override
	public void speed()
	{
	System.out.println("It's too hard to pedal up the hill.");
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Vbike vb1 = new Vbike();
		vb1.speed();
	}

}
