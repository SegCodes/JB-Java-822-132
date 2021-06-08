package loops;

public class Ex3 {

	public static void main(String[] args) {
		int n = (int)(Math.random()*101);
		
		System.out.println(n);
		System.out.println();
		
		for(int i = 0; i <= n; i += 2) {
			System.out.println(i);
		}
		
		System.out.println("=======================");
		for(int i = 0; i <= n; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}

	}

}
