package methodoverloading;

public class Restaurant 
{
	String foodName = "Burger";
	double price = 12.99;
	
	public String orderFood(String foodname, double price)
{
		return foodname + " " + price;
}
	public String orderFood(double price, String foodName)
{
		return price + " " + foodName;
}
	public static void main(String [] args)
	{
		Restaurant r1 = new Restaurant();
		
		System.out.println(r1.orderFood("Burger", 12.99));
		System.out.println(r1.orderFood(12.99, "Burger"));
}

}
