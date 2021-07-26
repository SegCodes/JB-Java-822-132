package c;

public class Person {
	
	private int id;
	private String name;
	private int age;
	
	public Person(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Person[id=" + id +", name=" + name + ", age=" + age +"]";
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return id + 100 * 2;
	}
	
	

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Person)) {
			return false;
		} 
		
		// If the object is of Person type, you must convert it in order to access it's traits.
		Person other = (Person)obj;
		return this.id == other.id;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
