import java.util.Scanner;

import ex05_01.PositivePoint;

public class ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PositivePoint p = new PositivePoint();
		
		p.move(10, 10);
		System.out.println(p.toString() + "�Դϴ�.");
		
		p.move(-5, 5);
		
		System.out.println(p.toString() + "�Դϴ�.");
		
		PositivePoint p2 = new PositivePoint(-10, -10);
		System.out.println(p2.toString()+"�Դϴ�.");
	}

}
