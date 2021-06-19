package a;

public class RegularClient extends Client {
	
	public RegularClient(int id, String name, float balance) {
		super(id, name, balance);
		this.commission_rate = 0.03f;
		this.interest_rate = 0.001f;
	}
	
	public String toString() {
		return "Client Type: Regular, ID: " + this.getId();
	}
	
}
