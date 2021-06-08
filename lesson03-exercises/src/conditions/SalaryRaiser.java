package conditions;

public class SalaryRaiser {

	public static void main(String[] args) {
		int salary = (int)(Math.random()*1001 + 5000);
		System.out.println("Current salary: " + salary);
		if(salary*1.1 < 6000) {
			salary*=1.1;
		}
		System.out.println("Updated salary: " + salary);

	}

}
