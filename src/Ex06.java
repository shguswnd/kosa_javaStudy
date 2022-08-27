import java.util.Scanner;
import java.util.InputMismatchException;
import Study01_Package.Circle;

public class Ex06 {
//예외처리하기!!!
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n =3;
		Circle c[] = new Circle[n];
		try {
			for(int i=0; i<n ; i++)
			{
				System.out.println("x, y, radius >>");
				double x = scan.nextDouble();
				double y = scan.nextDouble();
				int radius = scan.nextInt();
				c[i] = new Circle(x,y,radius);
			}
			for(int i=0; i<c.length; i++)
				c[i].show();
			}
		catch(InputMismatchException e) {
			System.out.println("입력값이 잘못되었습니다.");
		}
		scan.close();
	}

}
