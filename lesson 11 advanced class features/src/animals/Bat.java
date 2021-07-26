package animals;

public class Bat extends Mammal implements AdvancedFlyer {
	
	public void speak() {
		System.out.println("Squee?");
	}
	
	public void fly() {
		System.out.println("Fly like a bat.");
	}
	
	public void navigate() {
		System.out.println("Navigate like a bat");
	}
	
	public void takeOff() {
		System.out.println("The bat takes off.");
	}

	public void land() {
		System.out.println("The bat is landing.");
	}
}
