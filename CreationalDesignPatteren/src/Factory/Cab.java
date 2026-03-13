package Factory;

public class Cab implements Vechile {

	@Override
	public double totalFair(int distance) {
		return distance*18.75;
	}
	
}
