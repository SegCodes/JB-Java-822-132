package loops;

public class Exe7 {

	public static void main(String[] args) {
		
		int n = (int)(Math.random()*11);
		System.out.println("Number: " + n);
		int f = 1;
		
		for(int i = 1; i <= n; i++) {
			f *= i;
		}
		System.out.println("Factorial: " + f);

	}

}
