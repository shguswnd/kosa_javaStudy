package Study01_Package;

public class TV {
	private String Operation;
	private int year;
	private int Inch;
	public TV(String Operation, int year, int Inch){
		this.Operation = Operation;
		this.year = year;
		this.Inch = Inch;
	}
	
	public void show() {
		System.out.printf("%s���� ���� %d���� %d��ġ TV", this.Operation, this.year, this.Inch);
	}
}
