package animals;

public class Test {

	public static void main(String[] args) {
		Animal animal;
		
		animal = new Butterfly();
		animal.speak();
		
		animal = new Dog();
		animal.speak();
		
		System.out.println("=====================");
		
		Animal[] animals = new Animal[6];
		animals[0] = new Dog();
		animals[1] = new Bat();
		animals[2] = new Hawk();
		animals[3] = new Ostrich();
		animals[4] = new Ant();
		animals[5] = new Butterfly();
		
		for(int i = 0; i < animals.length; i++) {
			animals[i].speak();		
			
			if(animals[i] instanceof AdvancedFlyer) {
				AdvancedFlyer af = (AdvancedFlyer) animals[i];
				af.takeOff();
				af.navigate();
				af.fly();
				af.land();
			}else {
			
				// If animal[i] is a Flyer, call fly method.
				if (animals[i] instanceof Flyer) {
					Flyer f = (Flyer) animals[i];
					f.fly();
				}

				if (animals[i] instanceof Navigator) {
					Navigator n = (Navigator) animals[i];
					n.navigate();
				}
			}
			// ((Flyer)animals[i]).fly();
		}

	}

}
