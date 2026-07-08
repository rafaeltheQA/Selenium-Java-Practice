package encapsulation;

public class EmployeeTest
{
    public static void main(String[] args)
    {
        Employee e1 = new Employee();

        e1.setName("Rafael");
        e1.setEmployeeID(101);
        e1.setSalary(5000);

        System.out.println(e1.getName());
        System.out.println(e1.getEmployeeID());
        System.out.println(e1.getSalary());
    }
}