package conditions;

public class Exe2 {

	public static void main(String[] args) {
		int n = (int)(Math.random()*101);
		System.out.println(n);
		if(n<50) {
			System.out.println("Small!");
		}else if(n==50) {
			System.out.println("Bingo!");
		}else {
			System.out.println("Big!");
		}

	}

}
