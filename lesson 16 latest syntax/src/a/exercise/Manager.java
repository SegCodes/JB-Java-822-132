package a.exercise;

public class Manager extends Employee {

	public Manager() {
		
	}

	@Override
	public String toString() {
		return "Manager [first=" + getFirst() + ", last()=" + getLast() + ", salary()=" + getSalary()
				+ ", department()=" + getDepartment() + "]";
	}

	public Manager(String first, String last, double salary, String department) {
		super(first, last, salary, department);
	}

}
