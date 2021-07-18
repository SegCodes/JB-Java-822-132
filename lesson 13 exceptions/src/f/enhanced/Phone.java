package f.enhanced;

public class Phone implements AutoCloseable {
	
	public void close() throws Exception {
		System.out.println("Phone Closed.");
	}
}
