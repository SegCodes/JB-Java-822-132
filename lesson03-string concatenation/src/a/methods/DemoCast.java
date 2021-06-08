package a.methods;

public class DemoCast {

	public static void main(String[] args) {
		byte x = 100;
		int y = x;//cast from byte to int (implicit)
		
		System.out.println(x);
		System.out.println(y);
		
		int a = 100;
		byte b = (byte)a;//explicit
		
		System.out.println(a);
		System.out.println(b);
		
		int d = 1500;
		byte z = (byte)d;//explicit
		
		System.out.println(d);
		System.out.println(z);
		
		/*reasons for casting:
		 * 1 - Convert from decimals to integers */
		double n = 45.325;
		int num = (int)n;//cast from double to int
		
		System.out.println(n);
		System.out.println(num);
		
		//2 - 
	}

}
