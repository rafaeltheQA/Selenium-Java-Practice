package methodoverloading;

public class OnlineStore 
{
	String productName = "Laptop";
	double price = 999.99;
	
	
public String placeOrder(String productName, double price)
{
	return productName + " " + price;
}
public String placeOrder(double price, String productName)
{
	return price + " " + productName;
}
public String placeOrder(String productName, String productName1)
{
	return productName + " " + productName1;
}
public static void main(String[] args)
{
	OnlineStore os1 = new OnlineStore();
	
	System.out.println(os1.placeOrder("Laptop", 999.99));
	System.out.println(os1.placeOrder(999.99, "Laptop"));
	System.out.println(os1.placeOrder("Laptop", "Laptop"));
}
	
}
