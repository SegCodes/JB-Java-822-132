package a.exercise;

import java.util.*;

public class EmployeeStatistic {
	
	public static double averageSalary(List<? extends Employee> employees) throws RuntimeException {
		double sum = 0;
		int c = 0;
		
		for(Employee curEmp: employees) {
			if(curEmp != null) {
				sum += curEmp.getSalary();
				c++;
			}
		}
		
		if(c > 0) {
			double avg = sum / c;
			return avg;
		} else {			
			throw new RuntimeException("Error: list is empty");
		}
	} 
	
	public static int getNumberOfEmployees(List<? extends Employee> employees) {
		int c = 0;
		
		for(Employee curEmp: employees) {
			if(curEmp != null) {
				c++;
			}
		}
		return c;
	}
	
	public static int getNumberOfEmployees(List<? extends Employee> employees, String department) {
		int c = 0;
		
		for(Employee curEmp: employees) {
			if(curEmp != null && curEmp.getDepartment().equals(department)) {
				c++;
			}
		}
		return c;
	} 
}
