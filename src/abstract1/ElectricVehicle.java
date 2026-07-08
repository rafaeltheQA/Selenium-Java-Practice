package abstract1;

public class ElectricVehicle extends Vehicle
{
	int batteryLevel = 80;
	boolean charging = true;
	
	@Override
	public void startEngine()
	{
		System.out.println("Brand:" + brand);
		System.out.println("Year:" + year);
	}
	public void displayBatteryInfo()
	{
		System.out.println("BatteryLevel:" + batteryLevel);
		System.out.println("Charging:" + charging);
	}
	public static void main(String[] args)
	{
		ElectricVehicle ev1 = new ElectricVehicle();
		
		ev1.startEngine();
		ev1.displayBatteryInfo();
	}
}
