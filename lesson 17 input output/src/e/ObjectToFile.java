package e;

import java.io.*;

public class ObjectToFile {

	public static void main(String[] args) {
		
		Person p = new Person(101, "Dan", 25);
		System.out.println(p);
		
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("files/Person.object"))) {
			out.writeObject(p);
			System.out.println("Object moved to file.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
