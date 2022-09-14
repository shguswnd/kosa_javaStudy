package Factory;

public abstract class Computer{
	public abstract String getRam();
	public abstract String getHDD();
	public abstract String getCPU();
	
	@Override
	public String toString(){
		return "RAM = " + this.getRam() + ", HDD= " + this.getHDD()+", CPU = " + this.getCPU();
	}
}

class PC extends Computer{
	private String ram;
	private String hdd;
	private String cpu;
	
	public PC(String ram, String hdd, String cpu) {
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}

	@Override
	public String getRam() {
		return this.ram;
	}

	@Override
	public String getHDD() {
		return this.hdd;
	}

	@Override
	public String getCPU() {
		return this.cpu;
	}	
}

class Server extends Computer{
	private String ram;
	private String hdd;
	private String cpu;
	
	public Server(String ram2, String hdd2, String cpu2) {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String getRam() {
		return this.ram;
	}
	@Override
	public String getHDD() {
		// TODO Auto-generated method stub
		return this.hdd;
	}
	@Override
	public String getCPU() {
		// TODO Auto-generated method stub
		return this.cpu;
	}
}

class ComputerFactory{
//	public static Computer getComputer(String type, String ram, String hdd, String cpu) {
//	{
//		if("PC".equalsIgnoreCase(type))
//			return new PC(ram,hdd,cpu);
//		else if("Server".equalsIgnoreCase(type))
//			return new Server(ram, hdd, cpu);
//		
//		return null;
//	}
	public static Computer getComputer(ComputerAbstractFactory factory) {
		return factory.createComputer();
	}
}