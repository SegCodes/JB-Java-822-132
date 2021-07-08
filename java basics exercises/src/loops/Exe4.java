package loops;

public class Exe4 {

	public static void main(String[] args) {
		
		int max = (int)(Math.random()*101);
		System.out.print(max + ", ");
		int den = (int)(Math.random()*21);
		System.out.println(den);
		
		for(int i = 0; i <= max; i += den) {
			System.out.print(i + ", ");
		}
		
		/*for(int i = 0; i <= max; i++) {
		 * if(i % den == 0){
			System.out.print(i + ", ");
		   }
		}*/
	}

}
