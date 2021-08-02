package a.exercise;

import java.util.*;

public class Test {
	

	public static void main(String[] args) {
		List<Employee> emp = getRandomEmpolyees(200);
		print(emp);
		System.out.println("Total employees: " + EmployeeStatistic.getNumberOfEmployees(emp));
		System.out.println("Total employees in Defense: " + EmployeeStatistic.getNumberOfEmployees(emp, "Defense"));
		System.out.println("Total employees in Intel: " + EmployeeStatistic.getNumberOfEmployees(emp, "Intel"));
		System.out.println("Total employees in Technical: " + EmployeeStatistic.getNumberOfEmployees(emp, "Technical"));
		System.out.println("Total employees in Comms: " + EmployeeStatistic.getNumberOfEmployees(emp, "Communication"));
		System.out.println("Total employees in HR: " + EmployeeStatistic.getNumberOfEmployees(emp, "Human Resources"));
		System.out.println("Average employee salary: " + EmployeeStatistic.averageSalary(emp));
		
		System.out.println();
		
		List<Manager> mang = getRandomManagers(10);
		print(mang);
		System.out.println("Total managers: " + EmployeeStatistic.getNumberOfEmployees(mang));
		System.out.println("Total managers in Defense: " + EmployeeStatistic.getNumberOfEmployees(mang, "Defense"));
		System.out.println("Total managers in Intel: " + EmployeeStatistic.getNumberOfEmployees(mang, "Intel"));
		System.out.println("Total managers in Technical: " + EmployeeStatistic.getNumberOfEmployees(mang, "Technical"));
		System.out.println("Total managers in Comms: " + EmployeeStatistic.getNumberOfEmployees(mang, "Communication"));
		System.out.println("Total managers in HR: " + EmployeeStatistic.getNumberOfEmployees(mang, "Human Resources"));
		System.out.println("Average manager salary: " + EmployeeStatistic.averageSalary(mang));
		
	}
	
	private static String[] firstNames = {"Dan", "Tina", "Boris", "Jane", "Frank"};
	private static String[] lastNames = {"Johnson", "Fey", "Chikovsky", "Hill", "Jones"};
	private static String[] departments = {"Defense", "Intel", "Technical", "Communication", "Human Resources"};
	
	public static void print(Collection<? extends Employee> emp) {
		System.out.println("=====List=====");
		for(Employee e: emp) {
			System.out.println(e);
		}
		System.out.println("==============");
	}
	
	public static List<Employee> getRandomEmpolyees(int number) {
		List<Employee> list = new ArrayList<>();
		
		for(int i = 0; i < number; i++) {		
				list.add(getRandomEmpolyee());
		}
		
		return list;
	}
	
	public static List<Manager> getRandomManagers(int number) {
		List<Manager> list = new ArrayList<>();
		
		for(int i = 0; i < number; i++) {
				list.add(getRandomManager());
			}
		
		return list;
	}
	
	public static Employee getRandomEmpolyee() {
		
		String firstName = firstNames[(int)(Math.random()*firstNames.length)];
		String lastName = lastNames[(int)(Math.random()*lastNames.length)];
		double salary = Math.random()*20_000;
		String department = departments[(int)(Math.random()*departments.length)];
		
		return new Employee(firstName, lastName, salary, department);
	}
	
	public static Manager getRandomManager() {
		
		String firstName = firstNames[(int)(Math.random()*firstNames.length)];
		String lastName = lastNames[(int)(Math.random()*lastNames.length)];
		double salary = Math.random()*20_000;
		String department = departments[(int)(Math.random()*departments.length)];
		
		return new Manager(firstName, lastName, salary, department);
	}

}
