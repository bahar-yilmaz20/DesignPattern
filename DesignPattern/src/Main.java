import java.time.LocalDateTime;

import javax.print.attribute.standard.DateTimeAtCreation;

import SingletonPattern.SingletonPattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// For measuring how many obje was created
		for (int i = 0; i < 10; i++) {
			SingletonPattern s = SingletonPattern.getInstance();
			s.printName();		
		}
		
		// For measuring that same object that created in the different time
		SingletonPattern s1= SingletonPattern.getInstance();
		System.out.println("\nHashcode: "+s1.hashCode());
		
		SingletonPattern s2= SingletonPattern.getInstance();
		System.out.println("\nHashcode: "+s2.hashCode());
		
		 
		
		
		
		
		
		System.console();
	}

}
