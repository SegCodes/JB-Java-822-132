package loops;

public class Ex2 {

	public static void main(String[] args) {
		int n1 = (int)(Math.random()*101);
		int n2 = (int)(Math.random()*101);
		
		if(n1 > n2) {
			int t = n1;
			n1 = n2;
			n2 = t;
		}
		
		for(int i = n1; i <= n2; i++) {
			System.out.println(i);
		}
		System.out.println();
		
		int n3 = (int)(Math.random()*101);
		int n4 = (int)(Math.random()*101);
		int c = n3 > n4 ? (-1) : 1;
		
		for(int i = n3; i != n4; i += c) {
			System.out.println(i);
		}
	}

}
