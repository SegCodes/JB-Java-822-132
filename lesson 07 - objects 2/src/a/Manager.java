package a;

public class Manager extends Employee {
	
	// attributes
	private String department;
	
	// CTOR
	public Manager(String name, double salary, String department) {
		// calling a CTOR on the super class and pass arguments.
		super(name, salary);
		this.department = department;
	}
	
	public Manager() {
		
	}
	
	// Methods
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
}
