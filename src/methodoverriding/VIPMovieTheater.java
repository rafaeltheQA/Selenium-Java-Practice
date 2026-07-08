package methodoverriding;

public class VIPMovieTheater extends MovieTheater
{
	boolean reclinerSeats = true;
	double ticketPrice = 225.99;
	
	@Override
	public void displayMovieInfo()
	{
		System.out.println("recliner:" + reclinerSeats);
		System.out.println("ticketPrice:" + ticketPrice);
	}
	public static void main(String[] args)
	{
		VIPMovieTheater V1 = new VIPMovieTheater();
		
		V1.displayMovieInfo();
	
	}
}
