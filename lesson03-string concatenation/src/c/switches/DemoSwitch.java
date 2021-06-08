package c.switches;

public class DemoSwitch {
	
	public static void main(String[] args) {
		
		String key = "ON";
		
		switch(key) {
		case "ON": 
			System.out.println("Green light."); break;
		case "STANDBY": 
			System.out.println("Yellow Light."); break;
		case "OFF": 
			System.out.println("Red Light."); break;
		default:
			System.out.println("Error."); break;
		}
		
	}
	
}
