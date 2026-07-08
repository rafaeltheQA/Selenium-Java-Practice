package carpkg;

public class PrimitiveTypes {
	
	int bankaccount = 234567;
	float money = 999.9f;
	char bankletter = 'R';
	boolean r = true;
	String e = "Salvador";
	String f = "Cusco";
	
	public void printdata()
	{
		System.out.println(bankaccount);
		System.out.println(money);
		System.out.println(bankletter);
		System.out.println(e);
		System.out.println(f);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			PrimitiveTypes p1 = new PrimitiveTypes();
			p1.printdata();
	}
}