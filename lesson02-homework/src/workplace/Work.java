package workplace;

public class Work {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee(1263597, "Frank", 57, 15000);
		
		e1.id = 5915911;
		e1.name = "James";
		e1.age = 35;
		e1.salary = 20000;
		
		System.out.println("Employee Card: ID-" + e1.id + ", Name-" + e1.name + ", Age-" + e1.age + ", Salary-" + e1.salary + ".");
		System.out.println("Employee Card: ID-" + e2.id + ", Name-" + e2.name + ", Age-" + e2.age + ", Salary-" + e2.salary + ".");
	}

}
