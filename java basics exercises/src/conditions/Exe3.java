package conditions;

public class Exe3 {

	public static void main(String[] args) {
		
		int n = (int)(Math.random()*101);
		System.out.println(n);
		
		if(n > 50) {
			System.out.println("Big");
		}else {
			System.out.println("Small");
		}
		if(n % 2 == 0) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
	}

}
