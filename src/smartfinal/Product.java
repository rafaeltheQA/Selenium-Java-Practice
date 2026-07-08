package smartfinal;

public class Product extends Deli
{
	public void department(String item1, String item2, String item3)
	{
		System.out.println("department items: " + item1 + " and " + item2 + " and " + item3);
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Product p1 = new Product();
		p1.department("Apple", "Banana", "Orange");
		p1.department("Milk", "Creamer"); 
	}

}