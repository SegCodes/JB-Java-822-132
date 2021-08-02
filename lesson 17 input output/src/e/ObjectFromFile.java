package e;

import java.io.*;

public class ObjectFromFile {

	public static void main(String[] args) {
				
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("files/Person.object"))) {
			Object obj = in.readObject();
			System.out.println("Object red from file.");
			System.out.println(obj);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
