package d;

import java.io.*;

public class DataFromFile {

	public static void main(String[] args) {

		// The format is known.
		// Data size.
		// Data order.
		
		
		try (DataInputStream in = new DataInputStream(new FileInputStream("files/numbers.data"))) {
			int a = in.readInt();
			boolean b = in.readBoolean();
			double c = in.readDouble();
			byte d = in.readByte();
			long e = in.readLong();
			short f = in.readShort();
			String name = in.readUTF();
			System.out.println("Data red from file.");
			
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
			System.out.println(e);
			System.out.println(f);
			System.out.println(name);
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

}
