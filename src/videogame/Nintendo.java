package videogame;

public class Nintendo {
	
	String videogameName;
	int age;
	double price;
	int quanity;
	char game;
	boolean available;
	
	String consoleColor;
    String manufacturer;
    int releaseYear;
    double rating;
    boolean multiplayer;
    
	public Nintendo(String videogameName, int age, double price, 
		int quanity, char game, boolean available, String consoleColor, String manufacturer, int releaseYear,
		double rating, boolean multiplayer)
	{
		this.videogameName = videogameName;
		this.age = age;
		this.price = price;
		this.quanity = quanity;
		this.game = game;
	
		
		this.consoleColor = consoleColor;
		this.manufacturer = manufacturer;
		this.releaseYear = releaseYear;
		this.rating = rating;
		this.multiplayer = multiplayer;
	}
	public void displayNintendo()
	{
		System.out.println(videogameName);
		System.out.println(age);
		System.out.println(price);
		System.out.println(quanity);
		System.out.println(game);
		System.out.println(available);
		
		System.out.println(consoleColor);
		System.out.println(manufacturer);
		System.out.println(releaseYear);
		System.out.println(rating);
		System.out.println(multiplayer);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nintendo n1 = new Nintendo("Gamecube", 21, 400, 2, 'S', true, 
				"Black", "Yeti", 1996, 6.0, true);
		n1.displayNintendo();
		
	}

}
