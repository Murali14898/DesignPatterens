package Factory;

public class EVBikeFactory implements VechileFactory {

	@Override
	public Vechile getFactory() {
		
		return new EvBike();
	}

}
