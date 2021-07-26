package loops;

public class Exe1 {

	public static void main(String[] args) {
		
		int n = (int)(Math.random()*20);
		System.out.println(n);
		
		for(int i = 1; i < n; i++) {
			System.out.print(i + ", ");
		}
		System.out.println(n);

	}

}
