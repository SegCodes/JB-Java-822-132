package conditions;

public class Exe1 {

	public static void main(String[] args) {
		
		int big = (int) (Math.random()*10);
		System.out.print(big);
		int small = (int) (Math.random()*10);
		System.out.println(", " + small);
		
		if(small > big) {
			int t = big;
			big = small;
			small = t;
		}
		System.out.println(big);

	}

}
