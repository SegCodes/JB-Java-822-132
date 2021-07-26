package a;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		// Handling 2 - try/catch.
		try {			
			System.out.println(c.divide(5, 0));
		} catch(Exception e) {
			System.out.println("Error: " + e.getMessage() );
		}
		
		System.out.println("End.");
	}

}
