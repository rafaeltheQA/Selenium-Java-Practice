package methodoverloading;

public class Bank 
{
	String accountName = ("Saving");
	double balance = (1000.50);


public String deposit(String accountName, double balance)
{
	return accountName + " " + balance;
}
public String deposit(double balance, String accountName)
{
	return balance + " " + accountName;
}
public String deposit(String accountName, String accountName1)
{
	return accountName + " " + accountName1;
}
	public static void main(String[] args)
	{
		Bank b1 = new Bank();
		
		System.out.println(b1.deposit("Saving", 1000.50));
		System.out.println(b1.deposit(1000.50,"Saving"));
		System.out.println(b1.deposit("Saving", "Saving"));
	}
}