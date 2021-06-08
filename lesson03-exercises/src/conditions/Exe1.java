package conditions;

public class Exe1 {

	public static void main(String[] args) {
		int n1 = (int)(Math.random()*51);
		int n2 = (int)(Math.random()*51);
		
		System.out.printf("The numbers are: %d, %d.%n", n1, n2);
		
		if(n2>n1) {
			int t = n1;
			n1 = n2;
			n2 = t;
		}
		System.out.printf("The bigger number %d.", n1);
	}

}
