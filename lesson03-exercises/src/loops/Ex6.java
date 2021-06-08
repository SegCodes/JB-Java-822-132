package loops;

public class Ex6 {

	public static void main(String[] args) {
		int n = (int)(Math.random()*100001);
		System.out.println("The chosen number is: " + n);
		
		String s = "";
		int x = n;
		
		while(x != 0) {
			s += x % 10;
			x /= 10;
		}
		System.out.println(n + " reversed is " + s);
		
		System.out.println(Integer.parseInt(s) == n ? n + " is a a palindrom." : n + " is not a palindrom.");

	}

}
