package c;

import java.io.*;

public class BytesReadWrite {

	public static void main(String[] args) {

		File src = new File("c:/Seg/download.jfif");
		File dst = new File("c:/Seg/copy.jfif");
		
		try(
				BufferedInputStream in = new BufferedInputStream(new FileInputStream(src));
				BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(dst));
				) {
			
			// Perform IO(Input/Output).
			
			// Get file size.
			int availableBytes = in.available();
			System.out.println("file size: " + availableBytes);
			
			int b = in.read(); // Read the first byte.
			while(b!=-1) {
				out.write(b); // Write byte to destination file.
				b = in.read(); // Read the next byte.
			}
			
			System.out.println("Data copied from");
			System.out.println(src);
			System.out.println("to");
			System.out.println(dst);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
