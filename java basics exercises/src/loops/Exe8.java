package loops;

public class Exe8 {

	public static void main(String[] args) {
		
		int n = (int)(Math.random()*5);
		System.out.println("Index: " + n);
		int n1 = 1;
		int n2 = 1;
		System.out.print("Number in the index: ");
		
		//if(n == 0) {
			//System.out.println(n1);
		//}else {
			for(int i = 1; i < n; i++) {
				int t = n1;
				n1 = n2;
				n2 = t + n1;
			}
			System.out.println(n1);
		//}
		
	}

}
