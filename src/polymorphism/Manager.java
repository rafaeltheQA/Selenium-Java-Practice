package polymorphism;

public class Manager extends Employee
{
	@Override
public void calculateSalary(double basic)
{
	double incentives = 500;
	double totalSalary = basic + incentives;

	System.out.println("Manager Salary:" + totalSalary);
}	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Manager m1 = new Manager();
		m1.calculateSalary(3500);
	}

}
