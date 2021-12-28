package FactoryPattern;

import jdk.jfr.events.ThrowablesEvent;
import jdk.nashorn.internal.runtime.Context.ThrowErrorManager;

public class DeviceFactory implements IDeviceFactory{

	public IDevice PlayMusic(AppType type) {
		IDevice device;
		switch (type) {
		case Spotify:
			device=new Spotify();
			break;
		case Youtube:
			device=new Youtube();
			break;
		case Deezer:
			device=new Deezer();
			break;
		default:
			device=null;
			break;
		}
		return device;
	}

}
