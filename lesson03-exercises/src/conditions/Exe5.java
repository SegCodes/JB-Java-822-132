package conditions;

public class Exe5 {

	public static void main(String[] args) {
		int n1 = (int)(Math.random()*101);
		int n2 = (int)(Math.random()*101);
		int n3 = (int)(Math.random()*101);
		
		System.out.printf("The chosen numbers are: %d, %d, and %d.%n", n1, n2, n3);
		
		if(n1 > n2 && n1 > n3) {
			System.out.println("The largest is: " + n1);
		}else if(n2 > n3) {
			System.out.println("The largest is: " + n2);
		}else {
			System.out.println("The largest is: " + n3);
		}
	}

}
