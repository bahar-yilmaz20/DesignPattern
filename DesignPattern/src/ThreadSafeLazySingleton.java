
public class ThreadSafeLazySingleton {

	private static volatile ThreadSafeLazySingleton singleton;
	
	private static int count;
	private String name;
	
	private ThreadSafeLazySingleton() {
		count++;
		name= "ThreadedLazySingleton" + count ;
	}
	public static ThreadSafeLazySingleton getInstance() {
		synchronized (ThreadSafeLazySingleton.class) {
			if (singleton == null) {
				singleton =new ThreadSafeLazySingleton();
			}
		}
		return singleton;
	}
	public void printName () {
		System.out.println(name);
	}
	
}
