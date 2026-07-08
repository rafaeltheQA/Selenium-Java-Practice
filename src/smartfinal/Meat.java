package smartfinal;

public class Meat extends Product
{
	public void department(String item1, String item2, String item3)
	{
		System.out.println("department items: " + item1 + " and " + item2 + " and " + item3);
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Meat m1 = new Meat();
		m1.department("Chicken", "Beef", "Chorizon");
		m1.department("Apple", "Banana", "Orange");
		m1.department("Milk", "Creamer"); 
	}

}