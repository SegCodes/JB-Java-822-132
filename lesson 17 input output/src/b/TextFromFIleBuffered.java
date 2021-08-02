package b;

import java.io.*;

public class TextFromFIleBuffered {

	public static void main(String[] args) {
		
		// Create file.
		File file = new File("c:/Seg/letter.txt");
		
		// Create file reader to read characters from file.
//		try (FileReader in = new FileReader(file);) {
		try (BufferedReader in = new BufferedReader(new FileReader(file))) {
			// Read from file.
			String line = in.readLine(); // Read first line.
			while(line != null) {
				System.out.println(line);
				line = in.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
