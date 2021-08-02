<<<<<<< HEAD
package a;

/**
 * The objects of this class are ordered by id.
 */
public class Person implements Comparable<Person> {
	
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
	public int compareTo(Person other) {
		/* We compare between:
		 * This - the object that called the method.
		 * Other - the person we get as a parameter.
		*/
		if(this.id < other.id) {
			return -1;
		}else if(this.id > other.id) {
			return 1;
		}
		return 0;
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

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
}
=======
package a;

/**
 * The objects of this class are ordered by id.
 */
public class Person implements Comparable<Person> {
	
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
	public int compareTo(Person other) {
		/* We compare between:
		 * This - the object that called the method.
		 * Other - the person we get as a parameter.
		*/
		if(this.id < other.id) {
			return -1;
		}else if(this.id > other.id) {
			return 1;
		}
		return 0;
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

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
}
>>>>>>> branch 'master' of https://github.com/SegCodes/JB-Java-822-132
