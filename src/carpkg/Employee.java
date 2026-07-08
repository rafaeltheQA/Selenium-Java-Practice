package carpkg;

public class Employee {

    String employeeName;
    double salary;

    public Employee(String employeeName, double salary)
    {
        this.employeeName = employeeName;
        this.salary = salary;
    }

    public void displayEmployee()
    {
        System.out.println(employeeName);
        System.out.println(salary);
    }

    public static void main(String[] args) {

        Employee e1 = new Employee("Rafael", 75000);
        e1.displayEmployee();

    }
}