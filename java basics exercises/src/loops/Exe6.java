package loops;

public class Exe6 {

	public static void main(String[] args) {

		int n = (int)(Math.random()*100_001);
		System.out.print("Original: " + n + ", ");
		int x = n;
		int p = 0;
		
		while(x != 0) {
			p += x % 10;
			if(x / 10 == 0) {break;}
			p *= 10;
			x /= 10;
		}
		System.out.println("Backwards: " + p);
		System.out.println(n == p?"Palindrom":"Not Palindrom");
	}

}
