<<<<<<< HEAD
package g.singletons;

public class Superman {
	
	// 2. One instance of the singleton type.
	private static Superman instance = new Superman();
	
	// 1. Private CTOR.
	private Superman() {
		
	}
	
	// 3. Public getter for single instance.
	public static Superman getInstance() {
		return instance;
	}
	
	public void fly() {
		System.out.println("Superman is flying.");
	}
}
=======
package g.singletons;

public class Superman {
	
	// 2. One instance of the singleton type.
	private static Superman instance = new Superman();
	
	// 1. Private CTOR.
	private Superman() {
		
	}
	
	// 3. Public getter for single instance.
	public static Superman getInstance() {
		return instance;
	}
	
	public void fly() {
		System.out.println("Superman is flying.");
	}
}
>>>>>>> branch 'master' of https://github.com/SegCodes/JB-Java-822-132
