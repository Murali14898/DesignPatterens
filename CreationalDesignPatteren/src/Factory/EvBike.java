package Factory;

public class EvBike implements Vechile {

	@Override
	public double totalFair(int distance) {
		return distance*6.75;
	}

}
