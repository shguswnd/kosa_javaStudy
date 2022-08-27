import java.util.Scanner;
public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("입력한 점수에 따라 수/우/미/양/가 판정.");
		
		int jumsu = scan.nextInt();
		
		if(jumsu >= 90)
			System.out.println("수");
		else if(jumsu >= 80)
				System.out.println("우");
		else if(jumsu >= 70)
			System.out.println("미");
		else if(jumsu >= 60)
			System.out.println("양");
		else
			System.out.println("가");
	}

}
