package newword;

public class QA3 extends QA2
{
	public void multiplication(int a, int b)
{
		int c = a * b;
		System.out.println("multiplication between 2 numbers:" + c);
}

	public static void main(String[] args) 
{
		// TODO Auto-generated method stub
	QA3 q3 = new QA3();
	q3.multiplication(40,20);
	q3.addition(40,20);
	q3.subtraction(40,20);
	}

}