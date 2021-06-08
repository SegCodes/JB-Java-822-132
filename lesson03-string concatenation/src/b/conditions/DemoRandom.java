package b.conditions;

public class DemoRandom {

	public static void main(String[] args) {
		int n = (int)(Math.random()*11);//Returns a number between 0-10.
		System.out.println(n);
		
		System.out.println("================");
		
		//Exercise 1:
		int num = (int)(Math.random()*11);
		System.out.println(num);
		
		if(num>5) {
			System.out.println("Big.");
		}else{
			System.out.println("Small.");
		}
	}

}
