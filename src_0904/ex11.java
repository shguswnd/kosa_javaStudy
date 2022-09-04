import java.util.Scanner;

import ex05_01.CalExe;
public class ex11 {

	public static void main(String[] args) {
		int a=0;
		int b=0;
		char cal = ' ';
		CalExe CalExe = new CalExe();
		
		Scanner scan = new Scanner(System.in);
		while(true)
		{
			System.out.println("두 정수와 연산자를 입력하시오 >> ");
			a = scan.nextInt();
			b = scan.nextInt();
			cal = scan.next().charAt(0);
			CalExe.setValue(a, b);
			System.out.println(CalExe.calculate(cal));
			if(cal == 'x')
				return;
			
		}
	}

}
