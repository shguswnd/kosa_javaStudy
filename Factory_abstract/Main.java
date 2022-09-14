package Factory;


public class Main {

	public static void main(String[] args) {
//		Computer pc = ComputerFactory.getComputer("pc", "2 GB", "500 GB", "2.4 GHz");
//		Computer server = ComputerFactory.getComputer("server", "15 GB", "5 GB", "5.5 GHz");
//		System.out.println("Factory PC Config::"+pc);
//		System.out.println("Factory Server Config::"+server);
		Computer pc = ComputerFactory.getComputer(new PCFactory("2 GB", "500 GB", "2.4 GHz"));
		Computer server = ComputerFactory.getComputer(new PCFactory("15 GB", "5 GB", "5.5 GHz"));
		System.out.println("AbstractFactory PC Config::"+pc);
		System.out.println("AbstractFactory Server Config::"+server);
	}

}
