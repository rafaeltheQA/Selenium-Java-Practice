package carpkg;

public class Car

{
	String brand = "Civic";
	String model = "SE";
	int year = 1999;
	
	public void printCarDetails()	
	{
		System.out.println(brand);
		System.out.println(model);
		System.out.println(year);
		
    }
	
	public static void main(String[] args)
	
	{
	Car abc = new Car();
	abc.printCarDetails();
	
    }
}