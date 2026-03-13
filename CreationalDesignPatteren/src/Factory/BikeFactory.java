package Factory;

public class BikeFactory implements VechileFactory {
	@Override
	public Vechile getFactory() {
		
		return new Bike();
	}
}
