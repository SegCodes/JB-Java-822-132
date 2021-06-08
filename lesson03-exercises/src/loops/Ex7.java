package loops;

public class Ex7 {

	public static void main(String[] args) {
		int n = (int)(Math.random()*101);
		System.out.println("The chosen number is: " + n);
		long f = 1;
		
		for(int i = 1; i <= n; i++) {
			f *= i;
		}
		
		System.out.println(n + "! = " + f);

	}

}
