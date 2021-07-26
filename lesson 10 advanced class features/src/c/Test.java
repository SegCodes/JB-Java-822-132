package c;

public class Test {

	public static void main(String[] args) {
		
		Animal[] animals = new Animal[3];
		
		animals[0] = new Cat();
		animals[1] = new Dog();
		animals[2] = new Cow();
		
		for(int i = 0; i < animals.length; i++) {
			animals[i].Speak();
		}

	}

}
