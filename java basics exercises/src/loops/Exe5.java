package loops;

public class Exe5 {

	public static void main(String[] args) {
		
		int n = (int)(Math.random()*10_001);
		System.out.println("Original: " + n);
		int t = n;
		int dig = 1;
		int left = 0;
		int sum = 0;
		int back = 0;
		
		while(t != 0) {
	
			
			back += t % 10;
			left = t % 10;
			sum += t % 10;
			if(t / 10 == 0) {break;}
			dig++;
			back *= 10;
			t /= 10;
		}
		System.out.println("Digits: " + dig);
		System.out.println("Most left Digit: " + left);
		System.out.println("Digits sum: " + sum);
		System.out.println("Backwards: " + back);

	}

}
