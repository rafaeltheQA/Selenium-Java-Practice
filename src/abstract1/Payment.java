package abstract1;

public abstract class Payment 
{
	String paymentType = "Credit card";
	double amount = 100.00;
	
	public abstract void makePayment();
}