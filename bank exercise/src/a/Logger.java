package a;

public class Logger {
	
	private String driverName;
	
	public Logger(String driverName) {
		this.driverName = driverName;
	}
	
	public static void log(Log l) {
		System.out.println(l.toString());
	}
	
	//public Log[] getLogs(){
	
	//}
}
