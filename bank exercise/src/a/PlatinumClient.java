package a;

public class PlatinumClient extends Client {
	
	public PlatinumClient(int id, String name, float balance) {
		super(id, name, balance);
		this.commission_rate = 0.01f;
		this.interest_rate = 0.005f;
	}
	
	public String toString() {
		return "Client Type: Platinum, ID: " + this.getId();
	}
	
}
