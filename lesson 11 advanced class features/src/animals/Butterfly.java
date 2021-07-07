package animals;

public class Butterfly extends Insect implements Flyer {
	
	public void speak() {
		System.out.println("Bzzzz.");
	}
	
	public void fly() {
		System.out.println("Fly like a butterfly, sting like a bee.");
	}
}
