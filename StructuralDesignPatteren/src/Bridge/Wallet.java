package Bridge;

public class Wallet extends PaymentGateway{
	public Wallet(PaymentGatewayProvider pgp) {
		this.pgp = pgp;
	}
	public void pay(double amount) {
		System.out.println("Paying through Wallet");
		pgp.processPayment(amount);
		
	}
}
