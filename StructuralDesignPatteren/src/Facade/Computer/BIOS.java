package Facade.Computer;

public class BIOS {

	public void boot(CPU cpu, Memory memory) {
		System.out.println("Bios : Booting CPU and memory checks");
		cpu.initialize();
		memory.selfTest();
		
	}

}
