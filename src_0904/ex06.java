import ex05_01.ColorPoint;

public class ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColorPoint zeroPoint = new ColorPoint(); 
		System.out.println(zeroPoint.toString()+"입니다.");
		
		
		ColorPoint cp = new ColorPoint(10,10);
		cp.setXY(5, 5);
		cp.setColor("RED");
		System.out.println(cp.toString()+"입니다.");
	}

}
