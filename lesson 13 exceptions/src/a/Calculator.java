package a;

public class Calculator {
	
	// Handling 1 - throws declaration
	public int divide(int a, int b) throws Exception {
		if(b != 0) {			
			return a/b; // Returns an int.
		}else {			
			//System.out.println("Error: cannot divide by 0.");
			Exception e = new Exception("cannot divide by 0.");
			throw e; // Throws an exception.
		}
	}
	
}