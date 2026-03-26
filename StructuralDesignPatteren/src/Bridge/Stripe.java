package Bridge;

public class Stripe extends PaymentGatewayProvider{

	
	public void processPayment(double amount) {
		System.out.println("Stripe :"+amount);
	}

}
