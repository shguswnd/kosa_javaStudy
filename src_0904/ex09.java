import java.util.Scanner;

import ex05_01.StringStack;


public class ex09 {

	public static void main(String[] args) {
		int size = 0;
		String stackArr;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("�� ���� ���� ������ ũ�� �Է� >> ");
		size = scan.nextInt();
		StringStack stack = new StringStack(size);
		
		do{
			System.out.println("���ڿ� �Է� >> ");
			stackArr = scan.next();
			if(stackArr.equals("�׸�"))
				break;
		}while(stack.push(stackArr));
		
		System.out.println("������ �� ���� Ǫ�� �Ұ�!!");
		
		while(stack.length()>0)
		{
			System.out.println(stack.pop());
		}
		
	}

}
