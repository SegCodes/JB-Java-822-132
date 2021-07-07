package animals;

public class Hawk extends Bird implements AdvancedFlyer {
	
	public void speak() {
		System.out.println("Squak!");
	}
	
	public void fly() {
		System.out.println("Fly like a hawk.");
	}
	
	public void navigate() {
		System.out.println("Navigate like a hawk.");
	}
	
	public void takeOff() {
		System.out.println("The hawk takes off.");
	}

	public void land() {
		System.out.println("The hawk is landing.");
	}
}
