package geometery;

public class Test {

	public static void main(String[] args) {
		
		Shape circle = new Circle("red", 5);
		System.out.println("The " + circle.getColor() + " circle has an area of " + circle.getArea());

		Shape rectangle = new Rectangle("blue", 10, 3);
		System.out.println("The " + rectangle.getColor() + " circle has an area of " + rectangle.getArea());
		
	}

}
