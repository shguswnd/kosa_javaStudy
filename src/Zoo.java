import java.util.Scanner;
import Animal.landAnimal;

public class Zoo {

	public static void main(String[] args) {
		landAnimal[] Animal = new landAnimal[3];
		Scanner scan = new Scanner(System.in);
		
		

		for(int i=0 ; i<3 ; i++)
		{
			System.out.println("������ �ۼ��Ͻÿ�(�����̸�, �ٸ���, ����, ���Ŀ���)");
			String name = scan.next();
			int lag = scan.nextInt();
			boolean isTrue = scan.nextBoolean();
			String food = scan.next();
			Animal[i] = new landAnimal(name, 4, isTrue, food);
		}
		for(landAnimal value : Animal)
		{
			value.print(value);
		}
	}

}
