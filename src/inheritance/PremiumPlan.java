package inheritance;

public class PremiumPlan extends StreamingService 
{ 
	boolean downloadAvailable = true;
	int screensAllowed = 4;
	
	public void displayPremiumFeatures()
	{
	System.out.println("Download Available:" + downloadAvailable);
	System.out.println("Screen Allowed:" + screensAllowed);
	}

	public static void main(String[] args)
	{
		PremiumPlan pp1 = new PremiumPlan();
		pp1.displayPremiumFeatures();
		pp1.displayPlatformInfo();
		
	}
}
