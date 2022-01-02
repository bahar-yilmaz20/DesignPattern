package AbstractFactroyPattern;

public class MainAbstractFactory {
	public static void main(String[] args) {
		new Client(createSpesificFactory());
	}
	public static GUIFactory createSpesificFactory()
	{
		return new OSXFactory();
	}
}
