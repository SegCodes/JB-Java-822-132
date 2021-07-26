package conditions;

public class TaxCalculator {

	public static void main(String[] args) {
		
		int sal = (int)(Math.random()*200_001);
		System.out.println("Salary: " + sal);
		int tax = 0;
		
		if(sal > 100_000) {
			tax = sal - 100_000;
			tax *= 0.4;
			tax += 22_700;
		}else if(sal > 50_000) {
			tax = sal - 50_000;
			tax *= 0.3;
			tax += 7_700;
		}else if(sal > 23_000) {
			tax = sal - 23_000;
			tax *= 0.2;
			tax += 2_300;
		}else {
			tax = (int)(sal * 0.1);
		}
		System.out.println("After taxes: " + tax);

	}

}
