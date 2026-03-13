package Factory;

public class Auto implements Vechile {

	@Override
	public double totalFair(int distance) {
		
		return distance*12.50;
	}

}
