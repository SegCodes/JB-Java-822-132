package conditions;

public class Exe7 {

	public static void main(String[] args) {

		int year = (int)(Math.random()*3001);
		System.out.println(year);
		
		if((year % 4 == 0 && year % 100 != 0) || (year % 100 == 0 && year % 400 == 0)) {
			System.out.println("Leap year");
		}else {
			System.out.println("Normal year");
		}

	}

}
