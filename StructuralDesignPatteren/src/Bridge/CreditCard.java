package Bridge;

public class CreditCard extends PaymentGateway{

	public CreditCard(PaymentGatewayProvider pgp) {
		this.pgp = pgp;
	}
	
	public void pay(double amount) {
		System.out.println("Paying through Credit card");
		pgp.processPayment(amount);
		
	}

}
