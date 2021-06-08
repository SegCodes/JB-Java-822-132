package loops;

public class Ex4 {

	public static void main(String[] args) {
		int max = (int)(Math.random()*101);
		int den = (int)(Math.random()*11 + 1);
		
		System.out.println(max);
		System.out.println(den);
		System.out.println();;
		
		for(int i = 0; i <= max; i += den) {
			System.out.println(i);
		}
		
		System.out.println("===========================");
		
		for(int i = 0; i <= max; i++) {
			if(i % den == 0) {
				System.out.println(i);
			}
		}
	}

}
