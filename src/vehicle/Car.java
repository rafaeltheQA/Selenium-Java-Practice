package vehicle;

public class Car extends Vehicle implements VehicleFeatures
{
	@Override
	public void fuelType()
	{
		System.out.println("Car runs on Petrol or Diesel");
	}
	@Override
	public void start()
	{
		System.out.println("Car started");
	}
	@Override
	public void stop()
	{
		System.out.println("Car stopped");
	}
	  public static void main(String[] args)
	    {
	        Car c1 = new Car();

	        c1.displayBrand();
	        c1.fuelType();
	        c1.start();
	        c1.stop();
	    }
	}