package carpkg;

public class Product {
	
	String productName;
	double price;
	int quanity;
	boolean avaliable;
	
	public Product(String productName, double price, int quanity, String available)
	{
		this.productName = productName;
		this.price = price;
		this.quanity = quanity;
	}
	
	public void displayProduct()
	{
		System.out.println(productName);
		System.out.println(price);
		System.out.println(quanity);
		System.out.println(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Product("Strawberry", 450, 6, "True");
		p1.displayProduct();
	}

}
