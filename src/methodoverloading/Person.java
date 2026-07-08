package methodoverloading;

public class Person 
{
	String contactName = "Anthony";
	long phoneNumber = 5551234567L;
	
public String call(String contactName, long phoneNumber)
{
	return contactName + " " + phoneNumber;
}
public String call(long phoneNumber, String contactName)
{
	return phoneNumber + " " + contactName;
}
public String call(long phoneNumber, long phoneNumber1)
{
	return phoneNumber + " " + phoneNumber1;
}
	public static void main(String [] args)
{
	Person p1 = new Person();
	
	System.out.println(p1.call("Anthony", 5551234567L));
	System.out.println(p1.call(5551234567L, "Anthony"));
	System.out.println(p1.call(5551234567L, 5551234567L));
	}
}