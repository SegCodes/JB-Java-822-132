package b;

import java.io.*;

public class TextFromFIle {

	public static void main(String[] args) {
		
		// Create file.
		File file = new File("c:/Seg/letter.txt");
		
		// Create file reader to read characters from file.
		try (FileReader in = new FileReader(file)) {
			// Read from file.
			int c = in.read(); // Read first character.
			while(c!=-1) {
				System.out.print((char)c);
				c = in.read(); // Read next character.
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
