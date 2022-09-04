package ex05_01;

public class PositivePoint extends Point{
	private int x;
	private int y;
	
	public PositivePoint() {
		super(0,0);
	}
	public PositivePoint(int x, int y) {
		super(x,y);
		if(x<0 || y <0)
			super.move(0, 0);
	}
	public void move(int x, int y) {
		if(x<0 || y <0)
			move(0,0);
		
	}
	public String toString() {
		return "("+super.getX()+", "+super.getY()+")ÀÇ"; 
	}
}
