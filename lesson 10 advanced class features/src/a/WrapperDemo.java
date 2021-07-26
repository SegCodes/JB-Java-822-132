package a;

public class WrapperDemo {

	public static void main(String[] args) {
		// Sometimes we need to work with objects rather than primitives - e.g. collections.
		int x = 5; // Primitive
		Integer a = 5; // Object
		
		// Static methods
		
		// Minimum and Maximum
		System.out.println("Max val of int: " + Integer.MAX_VALUE);
		
		// Convert from string to int
		String ageAsString = "25";
		int age = Integer.parseInt(ageAsString);
		System.out.println(age);
	}

}
