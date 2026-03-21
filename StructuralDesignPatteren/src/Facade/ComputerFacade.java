package Facade;

import Facade.Computer.BIOS;
import Facade.Computer.CPU;
import Facade.Computer.Memory;
import Facade.Computer.OperatingSystem;
import Facade.Computer.PowerSupply;

public class ComputerFacade {
	
	BIOS bios;
	CPU cpu;
	Memory memory;
	OperatingSystem os;
	PowerSupply ps;
	
	public ComputerFacade(){
		bios = new BIOS();
		cpu = new CPU();
		memory = new Memory();
		os = new OperatingSystem();
		ps = new PowerSupply();
	}
	public void startComputer() {
		ps.supplyPower();
		bios.boot(cpu,memory);
		os.load();
	}
}
