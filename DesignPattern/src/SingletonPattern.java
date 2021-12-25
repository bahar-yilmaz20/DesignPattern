
public class SingletonPattern {

	public static SingletonPattern singleton= new SingletonPattern ();
	
	private static int count;
	private String name;
	
	private SingletonPattern() {
		count++;
		name= "Singleton" + count ;
	}
	public static SingletonPattern getInstance() {
		return singleton;
	}
	public void printName () {
		System.out.println(name);
	}
}
