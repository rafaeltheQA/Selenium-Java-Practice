package encapsulation;

public class Employee
{
    private String name;
    private int employeeID;
    private double salary;

    // Setter for name
    public void setName(String name)
    {
        this.name = name;
    }

    // Getter for name
    public String getName()
    {
        return name;
    }

    // Setter for employeeID
    public void setEmployeeID(int employeeID)
    {
        this.employeeID = employeeID;
    }

    // Getter for employeeID
    public int getEmployeeID()
    {
        return employeeID;
    }

    // Setter for salary
    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    // Getter for salary
    public double getSalary()
    {
        return salary;
    }

    public static void main(String[] args)
    {
        Employee e1 = new Employee();

        e1.setName("Rafael");
        e1.setEmployeeID(101);
        e1.setSalary(5000);

        System.out.println("Name: " + e1.getName());
        System.out.println("Employee ID: " + e1.getEmployeeID());
        System.out.println("Salary: " + e1.getSalary());
    }
}
