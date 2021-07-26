package loops;

public class Exe10 {

	public static void main(String[] args) {
		
		int n = (int)(Math.random()*101);
		System.out.println(n);
		
		for(int i = 0; i <= n; i++) {
			if(i % 7 == 0 || i % 10 == 7 || i / 10 == 7) {
				System.out.print("Boom!, ");
			}else {
				System.out.print(i + ", ");
			}
		}

	}

}
