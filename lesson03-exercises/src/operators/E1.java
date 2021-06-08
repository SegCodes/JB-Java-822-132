package operators;

public class E1 {

	public static void main(String[] args) {
		int n1 = (int)(Math.random()*101);
		int n2 = (int)(Math.random()*101);
		
		System.out.printf("The Chosen numbers are: %d, %d.%n", n1, n2);
		System.out.printf("The sum of the two is: %d.%n", (n1+n2));
		System.out.printf("The average of the two is: %d.%n", (n1+n2)/2);
		System.out.printf("The remainder of the first number divided by 10 is: %d.%n", n1%10);
		System.out.printf("The remainder of the second number divided by 10 is: %d.%n", n2%10);
		System.out.printf("The area of a rectangle with the measurements of the two numbers is: %d.%n", n1*n2);

		
	}

}
