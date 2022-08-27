import java.util.Scanner;
public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("소문자 알파벳 하나를 입력하시오 >>");
		String s = scan.next();
		char c = s.charAt(0);
		char firstChar = 'a';
		
		//System.out.printf("%d, %d", (int)firstChar, (int)c);
		
		for(int i = (int)firstChar ;i<=(int)c ; i++)
		{
			for(int j = (int)firstChar ; j<=((int)c-i+firstChar); j++)
			{
				System.out.print((char)j);
			}

			System.out.println();
		}


	}

}
