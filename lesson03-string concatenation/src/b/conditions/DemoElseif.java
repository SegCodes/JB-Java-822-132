package b.conditions;

public class DemoElseif {

	public static void main(String[] args) {
		int grade = (int)(Math.random()*11);
		System.out.println(grade);
		if(grade<6) {
			System.out.println("Failed...");
		}else if(grade==6) {
			System.out.println("Satisfactory.");
		}else if(grade<=8) {
			System.out.println("Good!");
		}else {
			System.out.println("Excellent!");
		}

	}

}
