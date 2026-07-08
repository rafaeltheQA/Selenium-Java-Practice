package firstpkg;

public class FirstJavaClass
{
	
	int a=10;
	
	float b = 10.5f;
	
	char c = 'X';
	
	boolean d = true;
	
	String e = "Java";
	
	String loc = "India";
	
	public void printdata()
	{
		System.out.println(a);	//action
		
		System.out.println(b);
		 
		System.out.println(c);
		
		System.out.println(d);
		
		System.out.println(e);
		
	}
	
	
	public static void main(String[] args) 
	{
			
		FirstJavaClass abc = new FirstJavaClass();
		
		abc.printdata();
		
		System.out.println(abc.loc);
		
	}

	
	
}
