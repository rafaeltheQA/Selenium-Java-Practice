package inheritance;

public class digitalLibrary extends Library
{
	String website = "www.library.com";
	boolean onlineAccess = true;
	
	public void digitalLibrary()
	{
		System.out.println("Website:" + website);
		System.out.println("OnlineAccess:" + onlineAccess);
	}
	public static void main(String [] args)
	{
	digitalLibrary dl1 = new digitalLibrary();
	dl1.displayLibraryInfo();
	dl1.digitalLibrary();
	}

}
