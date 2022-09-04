package ex05_01;

public class Point3D extends Point{
	private int z;
	public Point3D(int x, int y, int z)
	{
		super(x, y);
		this.z = z;
	}
	public void moveUp() {
		z++;
	}
	public void moveDown() {
		z--;
	}
	public void move(int x, int y) {
		super.move(x, y);
	}
	public void move(int x, int y, int z) {
		super.move(x, y);
		this.z = z;
	}
	public int getZ() {
		return this.z;
	}
	public String toString() {
		return "(" + getX() + "," + getY() + "," + getZ() + ") ÀÇ  Á¡"; 
	}
}
