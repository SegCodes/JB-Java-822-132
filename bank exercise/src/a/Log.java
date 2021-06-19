package a;

public class Log {
	
	private long timestamp;
	private int client_id;
	private String description;
	private float amount;
	
	public Log(long timestamp, int client_id, String description, float amount) {
		this.timestamp = timestamp;
		this.client_id = client_id;
		this.description = description;
		this.amount = amount;
	}
	
	public String toString() {
		return "Client ID: " + this.client_id + ", Description: " + this.description + ", Timestamp: " + this.timestamp;
	}
}
