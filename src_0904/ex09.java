import java.util.Scanner;

import ex05_01.StringStack;


public class ex09 {

	public static void main(String[] args) {
		int size = 0;
		String stackArr;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("총 스택 저장 공간의 크기 입력 >> ");
		size = scan.nextInt();
		StringStack stack = new StringStack(size);
		
		do{
			System.out.println("문자열 입력 >> ");
			stackArr = scan.next();
			if(stackArr.equals("그만"))
				break;
		}while(stack.push(stackArr));
		
		System.out.println("스택이 꽉 차서 푸시 불가!!");
		
		while(stack.length()>0)
		{
			System.out.println(stack.pop());
		}
		
	}

}
