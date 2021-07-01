package b;

public class Car {
	
	// Static initializer -> for class variables.
	// Used for complex initializations.
	static {
		System.out.println("Class Car loaded to memory.");
	}
	
	// Dynamic initializer -> for instance variables.
	// Used to prevent code duplication of CTORs.
	{
		System.out.println("Car made.");
	}
	
	// Class Variables - static -> belongs to the class.
	private static String factoryAddress = "Tel Aviv";
	private static String factoryPhone = "03-4459867";
	private static int counter;
	
	// Instance Variables - dynamic -> belongs to the object.
	private final int number; // Set for each car.
	private int speed;
	private String color;
	
	// Constants -> Written in Caps Lock only.
	static final int MAX_SPEED = 110;
	
	public Car(int number, int speed, String color) {
		this.number = number;
		this.speed = speed;
		this.color = color;
		counter++;
	}
	
	public static int getCounter() {
		// this.variable works only in dynamic methods(Object).
		return counter;
	}

	public static String getFactoryAddress() {
		return factoryAddress;
	}

	public static String getFactoryPhone() {
		return factoryPhone;
	}

	public int getNumber() {
		return number;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
}
