package loops;

public class Exe3 {

	public static void main(String[] args) {
		
		int n = (int)(Math.random()*20);
		System.out.println(n);
		
		for(int i = 0; i <= n; i += 2) {
			System.out.print(i + ", ");
		}

		/*for(int i = 0; i <= n; i++) {
		 * if(i % 2 == 0){
			System.out.print(i + ", ");
		   }
		}*/

	}

}
