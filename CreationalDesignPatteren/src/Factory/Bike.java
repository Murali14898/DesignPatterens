package Factory;

public class Bike implements Vechile {

	@Override
	public double totalFair(int distance) {
		
		return distance*8.5;
	}

}
