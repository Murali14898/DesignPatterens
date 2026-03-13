package Factory;

public class AutoFactory implements VechileFactory {

	@Override
	public Vechile getFactory() {
		
		return new Auto();
	}

}
