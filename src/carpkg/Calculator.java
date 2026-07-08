package carpkg;

public class Calculator {
	int z = 99;
	int y = 75;
	int x = 49;
	int w = 22;
	
	public void addition()
	{
		int v = z+y;
		int u = z+y+x+w;
		int o = z+z+y+y;
		System.out.println("addition of 2 numbers:" + v);
		System.out.println(u);
		System.out.println(o);
	}
	
	public void subtraction()
	{
		int t = x-w;
		int s = z-w;
		System.out.println("subtraction of 2 numbers:" + t);
		System.out.println(s);
	}
		
	public void multiplication()
	{
		int r = z*y;
		int q = y*w;
		System.out.println("multiplication of 2 numbers:" + r);
		System.out.println(q);
		
	}

	public void division()
	{
		int p = z/y;
		int n = w/y;
		int m = z/x;
		System.out.println("division of 2 numbers:" + p);
		System.out.println(n);
		System.out.println(m);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Calculator cl = new Calculator();
	cl.addition();
	cl.subtraction();
	cl.multiplication();
	cl.division();
	}

}
