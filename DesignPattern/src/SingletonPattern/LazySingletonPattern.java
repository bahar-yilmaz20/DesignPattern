package SingletonPattern;

public class LazySingletonPattern {
	
public static LazySingletonPattern singleton;
	private static int count;
	private String name;
	
	private LazySingletonPattern() {
		count++;
		name= "LazySingletonPattern" + count ;
	}
	public static LazySingletonPattern getInstance() {
		if (singleton == null) {
			singleton =new LazySingletonPattern();
		}
		return singleton;
	}
	public void printName () {
		System.out.println(name);
	}

}
