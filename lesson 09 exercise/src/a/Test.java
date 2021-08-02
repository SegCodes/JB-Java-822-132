package a;

public class Test {

	public static void main(String[] args) {
		
		Animal[] animels = {new Animal(), new Dog(), new Cat(), new Chicken(), new Horse()};
		
		Animal[] animals = new Animal[5];
		animals[0] = new Animal();
		animals[1] = new Dog();
		animals[2] = new Cat();
		animals[4] = new Horse();
		
		for(int i = 0; i < animals.length; i++) {
			if(animals[i] != null) {// In case the array isn't full.
				animals[i].Speak();
				// instaceof checks if the referenced object is of a certain type.
				if(animals[i] instanceof Cat) { 
					Cat cat = (Cat) animals[i]; // To see Cat method cast the Animal to Cat
					cat.Scratch();
				}
			}else {
				System.out.println("No Animal.");
			}
		}

	}

}
