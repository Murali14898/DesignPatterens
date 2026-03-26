package Bridge;

public class UPI extends PaymentGateway{

	public UPI(PaymentGatewayProvider pgp) {
		this.pgp = pgp;
	}
	public void pay(double amount) {
		System.out.println("Paying through UPI");
		pgp.processPayment(amount);
		
	}

}
