import java.util.Scanner;

import Study01_Package.Grade;
public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("����, ����, ���� ������ 3���� ���� �Է� >>");
		int math = scan.nextInt();
		int science = scan.nextInt();
		int english = scan.nextInt();
		Grade me = new Grade(math, science, english);
		System.out.println("����� " + me.average());
		
		scan.close();
	}

}
