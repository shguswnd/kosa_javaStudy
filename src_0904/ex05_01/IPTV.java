package ex05_01;

public class IPTV extends ColorTV{
	private String ip;
	private int size;
	private int color;
	public IPTV(String ip, int size, int color){
		super(size, color);
		this.ip = ip;
	}
	public void printProperty() {
		System.out.print("���� IPTV�� " + this.ip + " �ּ��� ");
		super.printProperty();
	}
}
