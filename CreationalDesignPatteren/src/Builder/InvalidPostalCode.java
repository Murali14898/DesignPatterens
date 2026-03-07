package Builder;

public class InvalidPostalCode extends Exception {
	public InvalidPostalCode() {
		super();
	}
	
	public InvalidPostalCode(String msg) {
		super(msg);
	}
}
