package Bridge;

public class PayPal extends PaymentGatewayProvider{

	
	public void processPayment(double amount) {
		System.out.println("PayPal :"+amount);
	}

}
