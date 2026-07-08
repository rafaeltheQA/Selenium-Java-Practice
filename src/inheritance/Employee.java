package inheritance;

public class Employee extends Person 
{
	double salary = 50000;
	
				
	public void displaySalary()
	{

	System.out.println("Salary:" + salary);
	}
	public static void main(String[] args)
	{
	
	Employee e1 = new Employee();
	e1.displayPersonInfo();
	e1.displaySalary();
	}
}
