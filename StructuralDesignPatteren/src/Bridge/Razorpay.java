package Bridge;

public class Razorpay extends PaymentGatewayProvider{

	
	public void processPayment(double amount) {
		
		System.out.println("RozarPay :"+amount);
		
	}

}
