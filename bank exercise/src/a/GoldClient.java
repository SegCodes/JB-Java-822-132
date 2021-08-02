package a;

public class GoldClient extends Client {
	
	public GoldClient(int id, String name, float balance) {
		super(id, name, balance);
		this.commission_rate = 0.02f;
		this.interest_rate = 0.003f;
	}
	
	public String toString() {
		return "Client Type: Gold, ID: " + this.getId();
	}
	
}
