package d;

import java.io.*;

public class DataToFile {

	public static void main(String[] args) {

		// The format is known.
		// Data size.
		// Data order.
		
		int a = 150;
		boolean b = 10 < 100;
		double c = 5.56;
		byte d = 25;
		long e = 15_000;
		short f = 20;
		String name = "Boris";
		
		try (DataOutputStream out = new DataOutputStream(new FileOutputStream("files/numbers.data"))) {
			out.writeInt(a);
			out.writeBoolean(b);
			out.writeDouble(c);
			out.writeByte(d);
			out.writeLong(e);
			out.writeShort(f);
			out.writeUTF(name);
			System.out.println("Data written to file.");
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

}
