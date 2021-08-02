package loops;

public class Exe9 {

	public static void main(String[] args) {
		int n = (int)(Math.random()*8);
		System.out.println("Index: " + n);
		int n1 = 1;
		int n2 = 1;
		
		System.out.print(n1);
		if(n > 1) {
			System.out.print(", ");
			for(int i = 1; i < n; i++) {
				int t = n1;
				n1 = n2;
				n2 = t + n1;
				System.out.print(n1 + ", ");
			}
		}
	}

}
