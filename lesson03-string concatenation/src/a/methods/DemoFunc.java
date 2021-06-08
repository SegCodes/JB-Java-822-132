package a.methods;

public class DemoFunc {

	public static void main(String[] args) {
		int s = Sum(5, 9);
		System.out.println(s);
		System.out.println(Sum(3, 5));
		
		int a = 10;
		int b = 15;
		System.out.println(Sum (a, b));
		
		
		//Reason 2 to cast:
		//Matching argument's type to the method's
		double c = 8;
		double d = 7.5;
		System.out.println(Sum((int)c, (int)d));
	}
	
	//The method calculates and returns the sum of 2 numbers.
	public static int Sum(int a, int b) {
		return a + b;
	}

}
