package b.runtimeExceptions;

public class Demo1 {

	public static void main(String[] args) {
		
		// ClassCastException
		Object obj = "aaa";
		String str = (String) obj;
		//Date date = (Date) obj;
		
		// NumberFormatException
		int x = Integer.parseInt("AAA");
		
		// ArrayIndexOutOfBoundsException
		System.out.println(args[9]);
		
		// NegativeArraySizeException
		int[] arr = new int[-3];
		
		// NullPointerException
		args = null;
		System.out.println(args.toString());
		
		// ArithmeticException
		System.out.println(4/0);
	}

}
