import java.util.Scanner;
import Animal.landAnimal;

public class Zoo {

	public static void main(String[] args) {
		landAnimal[] Animal = new landAnimal[3];
		Scanner scan = new Scanner(System.in);
		
		

		for(int i=0 ; i<3 ; i++)
		{
			System.out.println("동물을 작성하시요(동물이름, 다리수, 꼬리, 육식여부)");
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
