package b;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("Total cars made: " + Car.getCounter());
		
		System.out.println("Class variables values:");
		System.out.println("Car factory address: " + Car.getFactoryAddress());
		System.out.println("Car factory Phone: " + Car.getFactoryPhone());
			
		Car c1 = new Car(111, 0, "White");
		System.out.println("Total cars made: " + Car.getCounter());
		Car c2 = new Car(222, 30, "Yellow");
		System.out.println("Total cars made: " + Car.getCounter());
		Car c3 = new Car(333, 90, "Red");
		System.out.println("Total cars made: " + Car.getCounter());
			
		System.out.println("Instances variables values:");
		System.out.println(c1.getColor());
		System.out.println(c2.getColor());
		System.out.println(c3.getColor());
		
		System.out.println("Max car speed: " + Car.MAX_SPEED);
		
		System.out.println("π = " + Math.PI);
	}

}
