package a;

public class Exe {

	public static void main(String[] args) {
		System.out.println("========My Answer========");
		double a = Math.random();
		System.out.println(a);
		System.out.println(a > 0.5 ? "Big" : "Small");
		System.out.println("========Teacher's Answer========");
		System.out.println(Math.random() > 0.5 ? "Big" : "Small");

	}

}
