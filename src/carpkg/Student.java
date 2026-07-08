package carpkg;

public class Student {
	
	String name= "Rafael";
	int registrationNumber = 8211978;
	
	public void displayInfo() {
		System.out.println(name);
		System.out.println(registrationNumber);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Student s1 = new Student();
		s1.displayInfo();
	}

}