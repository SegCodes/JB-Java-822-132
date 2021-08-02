package classNesting;

public class Outer {
	
	private int x = 5;
	private static int y = 10;
	
	// Inside the class we can nest other classes.
	// Dynamic class - each object of this class depends on the object of the outer class.
	public class Inner {
		// You have access to private members of the outer class.
		public void method() {
			System.out.println(x);
		}
	}
	
	// Static class - each object of the class is independent.
	public static class StaticNested {
		public void method() {
			// You have access to private static members of the outer class.
			System.out.println(y);
		}
	}
}
