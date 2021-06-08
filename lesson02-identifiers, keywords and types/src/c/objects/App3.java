package c.objects;

public class App3 {

	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
		
		p1.id = 781659;
		p1.name = "Asaf";
		p1.age = 25;
		
		p2.id = 789156;
		p2.name = "Yoram";
		p2.age = 32;
		
		System.out.println("Name: " + p1.name + ". ID: " + p1.id + ". Age: " + p1.age + ".");
		System.out.println("Name: " + p2.name + ". ID: " + p2.id + ". Age: " + p2.age + ".");

	}

}
