package Factory;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Consider Rapido and Ola
		 * Whenever you book a ride you have 4-5 options 
		 * 1. Bike 2. Auto 3. Minicab 4. Sedan 5. Electric Vechile ( Now a days )
		 * 
		 * Rapido/Ola people never implement this feature like in main method when client select bike 
		 * Main(){
		 * if(modeOfTrans == bike){
		 * implement logic fee calculation
		 * }
		 * if(modeOfTrans == auto){
		 * implement logic fee calculation
		 * }
		 * .....
		 * }
		 * They should implement using factory design pattern
		 * Factory design pattern says : If you have no of ways to solve a task
		 * Each task has different way to solve the go with factory design patteren
		 * 
		 */
		String clientClickedVechileType = "bike";
		double totalFair = new Main().calculateTotaoFair(clientClickedVechileType);
		
	}

	private double calculateTotaoFair(String clientClickedVechileType) {
		VechileFactory vf = vechileDecider(clientClickedVechileType);
		System.out.println(vf.getFactory().totalFair(20));
		return 0;
	}

	private static VechileFactory vechileDecider(String clientClickedVechileType) {
		if(clientClickedVechileType.equalsIgnoreCase("Bike")) {
			return new BikeFactory();
		}
		else if(clientClickedVechileType.equalsIgnoreCase("evBike")) {
			return new EVBikeFactory();
		}
		else if(clientClickedVechileType.equalsIgnoreCase("auto")) {
			return new AutoFactory();
		}
		else if(clientClickedVechileType.equalsIgnoreCase("cab")) {
			return new CabFactory();
		}
		return new BikeFactory();
	}

	
}

