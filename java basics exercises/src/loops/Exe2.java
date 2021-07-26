package loops;

public class Exe2 {

	public static void main(String[] args) {
		
		int n1 = (int)(Math.random()*20);
		System.out.print(n1 + ", ");
		int n2 = (int)(Math.random()*20);
		System.out.println(n2);
		
		if(n1 > n2) {
			int t = n1;
			n1 = n2;
			n2 = t;
		}
		
		for(int i = n1; i < n2; i++) {
			System.out.print(i + ", ");
		}
		System.out.println(n2);

	}

}
