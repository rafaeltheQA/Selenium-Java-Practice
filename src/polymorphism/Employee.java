package polymorphism;

public class Employee 
{
	public void calculateSalary(double basic)
	{
		System.out.println("Basic Salary:" + basic);
	}
	public void calculateSalary(double basic, double allowance)
	{
		double totalSalary = basic + allowance;
		
		System.out.println("Total Salary and Allowance:" + totalSalary);
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
		e1.calculateSalary(900);
		e1.calculateSalary(7700, 500);
	}

}
