package ex05_01;

public class ColorTV extends TV{
	private int color;
	private int size;
	public ColorTV(int size, int color)
	{
		super(size);
		this.color = color;
	}

	public void printProperty(){
		this.size = getSize();
		System.out.println(this.size + "인치 " + this.color + "컬러");
	}
}
