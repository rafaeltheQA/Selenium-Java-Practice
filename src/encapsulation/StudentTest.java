package encapsulation;

public class StudentTest 
{
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
