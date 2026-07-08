package inheritance;

public class EmergencyHospital extends Hospital
{
	boolean ambulanceService = true;
	int emergencyDoctors = 15;
	
	public void displayEmergencyInfo()
	{
		System.out.println("AmbulanceService:" + ambulanceService);
		System.out.println("EmergencyDoctors:" + emergencyDoctors);
	}
	public static void main(String [] args)
	{
		EmergencyHospital eh1 = new EmergencyHospital();
		
		eh1.displayHospitalInfo();
		eh1.displayEmergencyInfo();
	}

}
