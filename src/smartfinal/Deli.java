package smartfinal;

public class Deli 
{
	public void department(String item1, String item2)
	{
		System.out.println("department items: " + item1 + " and " + item2);
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Deli d1 = new Deli();
		d1.department("Milk", "Creamer");
	}

}
