package encapsulation;

public class Student 
{
	private String studentName;
	private int studentId;
	private char grade;

	public void setstudentName(String studentName)
	{
		this.studentName = studentName;
	}
	
	public String getstudentName()
	{
		return studentName;
	}
	public void setstudentId(int studentId)
	{
		this.studentId = studentId;
	}
	public int getstudentId()
	{
		return studentId;
	}
	public void setgrade(char grade)
	{
		this.grade = grade;
	}
	public char getgrade()
	{
		return grade;
	}
	public static void main(String[] args) 
	{
		Student s1 = new Student();
		
		s1.setstudentName("Anthony");
		s1.setstudentId(5);
		s1.setgrade('A');

		System.out.println("studentName:" + s1.getstudentName());
		System.out.println("studentId:" + s1.getstudentId());
		System.out.println("grade:" + s1.getgrade());
	}

}
