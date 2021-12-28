package FactoryPattern;

public class MainFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeviceFactory device = new DeviceFactory();
		
		IDevice dSpotify = device.PlayMusic(AppType.Spotify);
		dSpotify.PlayMusic();
	}

}
