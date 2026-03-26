package Bridge;


/*
 * This design pattern prevents class explosion 
 * Example:
 * we have car types ( Sedan , HatchBack , SUV..) and Engine types (Petrol,Diesel,Electric)
 * If we create different types of car without following Bridge designpattern then we may end of ceating classes like
 * PetrolSedan , PetrolHatchBack .... may be 9  classes if any type increases suppose CNG engine type again you have to create
 * 3 more classes
 * Total classes = cartype * EngineType
 * 
 *This problem solved by Bridge design patteren
 *It says if you have a concept like car / Payment devide into High Level Part and Low Level part
 *Here in this example Car is HLP and Engine is LLP
 *Car interface having a Engine reference ( Hash a relation ship)
 *Then you need to ceate only cartype+enginetype number of clsses
 */

//Implementing realtime use cases Like payment system.
//Payment Types → CreditCard, UPI, Wallet
//Providers → Razorpay, Stripe, PayPal
public class Main {

	public static void main(String[] args) {
		PaymentGateway pg = new CreditCard(new PayPal());
		pg.pay(100);
	}

}
