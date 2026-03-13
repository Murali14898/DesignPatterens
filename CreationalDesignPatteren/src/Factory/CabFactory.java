package Factory;

public class CabFactory implements VechileFactory {
	@Override
	public Vechile getFactory() {
		
		return new Cab();
	}
}
