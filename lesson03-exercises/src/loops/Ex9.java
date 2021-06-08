package loops;

public class Ex9 {

	public static void main(String[] args) {
		int p = (int)(Math.random()*51);
		int n1 = 1;
		int n2 = 0;
		
		System.out.println("Index: " + p);
		
		for(int i = 1; i < p; i++) {
			int f = n1;
			n1 = n2;
			n2 = f + n1;
			System.out.print(n2 + ", ");
		}
		
		if(p > 2) {
			int f = n1;
			n1 = n2;
			n2 = f + n1;
		}
		
		System.out.print(n2 + ".");

	}

}
