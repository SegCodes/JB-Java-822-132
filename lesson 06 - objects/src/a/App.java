package a;

public class App {

	public static void main(String[] args) {
		
		Person p1 = new Person();

		p1.setId(101);
		p1.setName("Joseph");
		p1.setAge(32);
		p1.setAge(200);

		System.out.println(p1.getId());
		System.out.println(p1.getName());
		System.out.println(p1.getAge());

		Person p2 = new Person(102, "Adam", 25);

		p1.Speak();
		p2.Walk();
	}

}
