import java.util.Scanner;
public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		
		int number1 = scan.nextInt();
		int number2 = number1;
		int cnt = 0;
		int rCount = 10;


		while((number2/rCount) != 0)
		{
			if((number2/rCount) != 0)
			{
				number2 /= rCount;
				cnt++;
			}
		}
		System.out.println("입력한 숫자는 :" + number1 + "는  "  + cnt + "자리수");
		
	}

}
