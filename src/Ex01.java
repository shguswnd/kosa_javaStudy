import java.util.Scanner;
public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("�Է��� ������ ���� ��/��/��/��/�� ����.");
		
		int jumsu = scan.nextInt();
		
		if(jumsu >= 90)
			System.out.println("��");
		else if(jumsu >= 80)
				System.out.println("��");
		else if(jumsu >= 70)
			System.out.println("��");
		else if(jumsu >= 60)
			System.out.println("��");
		else
			System.out.println("��");
	}

}
