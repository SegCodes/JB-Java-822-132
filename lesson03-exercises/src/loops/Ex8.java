package loops;

public class Ex8 {

	public static void main(String[] args) {
		int n1 = 1;
		int n2 = 1;
		int p = (int)(Math.random()*51);
		
		for(int i = 2; i < p; i++) {
			n2 += n1;
			n1 = n2 - n1;
		}
		
		System.out.printf("The number in Fibonacci set in postion %d is %d.%n", p, n2);

	}

}
