package abstract1;

public class OnlinePayment extends Payment
{
	String website = "Amazon";
	boolean paymentSuccess = true;
	
	@Override
	public void makePayment()
	{
		System.out.println("Payment Type:" + paymentType);
		System.out.println("Amount:" + amount);
	}
	public void displayPaymentInfo()
	{
		System.out.println("Website:" + website);
		System.out.println("PaymentSuccess:" + paymentSuccess);
	}
	public static void main(String[] args)
	{
		OnlinePayment op1 = new OnlinePayment();
		
		op1.makePayment();
		op1.displayPaymentInfo();
	}
}