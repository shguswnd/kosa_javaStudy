import java.util.Scanner;
public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자 맞추기 게임(10~99)");
		//(int)Math.random() * (최대값 - 최소값 + 1) +최소값
		do {
			int rand = (int)((Math.random() * 90) + 10);
		
			number = scan.nextInt();
			System.out.printf("입력된값 : [%d], 난수 값 : [%d]\n", number, rand);
			if((number == rand)) {
				System.out.println("정답입니다");
				break;
			}
		}while((number >= 10)&&(number <100));
		if((number < 10) || number >= 100)
			System.out.printf("[%d]잘못된 입력값 입니다.", number);
	}

}
