package conditions;

public class Exe5 {

	public static void main(String[] args) {
		
		int n1 = (int)(Math.random()*101);
		System.out.print(n1 + ", ");
		int n2 = (int)(Math.random()*101);
		System.out.print(n2 + ", ");
		int n3 = (int)(Math.random()*101);
		System.out.println(n3);
		
		if(n1 > n2 && n1 > n3) {
			System.out.println(n1);
		}else if(n2 > n3) {
			System.out.println(n2);
		}else {
			System.out.println(n3);
		}

	}

}
