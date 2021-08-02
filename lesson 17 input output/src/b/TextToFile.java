package b;

import java.io.*;

public class TextToFile {

	public static void main(String[] args) {
		
		// Create file.
		File file = new File("c:/Seg/letter.txt");
		
		// Create file writer. Use append = true if you want to append.
		try (FileWriter out = new FileWriter(file, true)) {
			// Write in file.
			out.write("Hello from Java app\n");
			System.out.println("Data written to " + file);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
