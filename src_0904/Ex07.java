import ex05_01.Point3D;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point3D p = new Point3D(1, 2, 3);
		System.out.println(p.toString() + "�Դϴ�.");
		p.moveUp();
		
		System.out.println(p.toString()+"�Դϴ�.");
		p.moveDown();
		p.move(10, 10);
		System.out.println(p.toString() + "�Դϴ�.");
		
		p.move(100, 200, 300);
		System.out.println(p.toString() + "�Դϴ�.");
		
	}

}
