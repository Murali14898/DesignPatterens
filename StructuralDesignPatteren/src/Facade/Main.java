package Facade;

/*
 * A client(Chrome/edge/postman/java main class) tries to connect with a complex Application.
 * Complex system which comprises of many classes.
 * We have to design in such a way that the client need not worry about the complexity of the application.
 * We will put a Facade between Client and Complex Application.
 * Client call the facade and facade call the complex application whenever needed.
 * 
 * Ex : API Gateway,Controllers
 * 
 * Benefits :
 * Client need not to connect with complex structure
 * Facade decouple client from the complex subsystem.
 * Principle of least Knowledge 
 */

//Implementing an example computer when you switch on multiple thing is happening behind (BIOS,CPU,Memory,OS..)
public class Main {
	private ComputerFacade cf;
	
	public Main() {
		cf = new ComputerFacade();
	}

	public static void main(String[] args) {
		new Main().cf.startComputer();
		System.out.println("Computer started");
	}

}
