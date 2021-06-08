package loops;

public class Ex5 {

	public static void main(String[] args) {
		int n = (int)(Math.random()*10001);
		
		System.out.println("The chosen number: " + n);
		System.out.println();
		
		int sumd = 0;
		int d = 0;
		String opp = "";
		int x = n;
		
		while(x > 9) {
			sumd += x % 10;
			opp += x % 10;
			d++;
			x /= 10;
		}
		
		sumd += x % 10;
		d++;
		opp += x % 10;
		int r = x;
		
		System.out.println("Number of digits: " + d);
		System.out.println("Most left digit: " + r);
		System.out.println("Sum of digits: " + sumd);
		System.out.println("The number reversed: " + opp);

	}

}
