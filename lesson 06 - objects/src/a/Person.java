package a;

public class Person {

	// attributes
	private int id;
	private String name;
	private int age;

	// constructors
	public Person(int id, String name, int age) {
		this.id = id;
		this.name = name;
		setAge(age); // using the method to check valid input
	}

	public Person() {

	}

	// Get/Set
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age >= 0 && age <= 120) {
			this.age = age;
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// methods
	void Speak() {
		System.out.println(name + " is speaking.");
	}

	void Walk() {
		System.out.println(name + " is walking.");
	}
}
