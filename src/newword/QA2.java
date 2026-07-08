package newword;

public class QA2 extends QA1
{
	public void subtraction(int a, int b)
{
		int c = a - b;
		System.out.println("subtraction between 2 numbers:" + c);
}

	public static void main(String[] args) 
{
		// TODO Auto-generated method stub
	QA2 q2 = new QA2();
	q2.addition(40,20);
	q2.subtraction(40,20);
	}

}