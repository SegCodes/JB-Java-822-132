package loops;

public class Boom {

	public static void main(String[] args) {
		for(int i = 0; i <= 100; i++) {
			
			if(i % 7==0) {
				System.out.println("Boom!");
				continue;
			}else if(i%10 == 7 || i/10 == 7) {
				System.out.println("Boom!");
			}else {
				System.out.println(i);
			}
			
		}

	}

}
