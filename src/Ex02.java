import java.util.Scanner;
public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("���� ���߱� ����(10~99)");
		//(int)Math.random() * (�ִ밪 - �ּҰ� + 1) +�ּҰ�
		do {
			int rand = (int)((Math.random() * 90) + 10);
		
			number = scan.nextInt();
			System.out.printf("�ԷµȰ� : [%d], ���� �� : [%d]\n", number, rand);
			if((number == rand)) {
				System.out.println("�����Դϴ�");
				break;
			}
		}while((number >= 10)&&(number <100));
		if((number < 10) || number >= 100)
			System.out.printf("[%d]�߸��� �Է°� �Դϴ�.", number);
	}

}
