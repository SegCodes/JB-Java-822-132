package conditions;

public class TaxCalculator {

	public static void main(String[] args) {
		int money = (int)(Math.random()*200001);
		System.out.println("The salary is: " + money);
		
		int tax;
		if(money >= 100000) {
			tax = money - 100000;
			tax *= 0.4;
			tax += 22700;
		}else if(money >= 50000) {
			tax = money - 50000;
			tax *= 0.3;
			tax += 7700;
		}else if(money >= 23000) {
			tax = money - 23000;
			tax *= 0.2;
			tax += 2300;
		}else {
			tax = (int)(money * 0.1);
		}
		
		System.out.println("Total tax payment: " + tax);
		System.out.println("Remaining salary: " + (money - tax));

	}

}
