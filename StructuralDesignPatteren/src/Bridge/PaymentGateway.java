package Bridge;

public abstract class PaymentGateway {
	
	public PaymentGatewayProvider pgp;
	
	public abstract void pay(double amount);

}
