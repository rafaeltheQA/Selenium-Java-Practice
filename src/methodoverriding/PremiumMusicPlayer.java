package methodoverriding;

public class PremiumMusicPlayer extends MusicPlayer
{
	boolean offlineMode = true;
	int playlistCount = 25;
	
	@Override
	public void playMusic()
	{
		System.out.println("offlineMode:" + offlineMode);
		System.out.println("playlistCount:" + playlistCount);
	}
	public static void main(String [] argsg)
	{
	PremiumMusicPlayer p1 = new PremiumMusicPlayer();
	p1.playMusic();
	}
}
