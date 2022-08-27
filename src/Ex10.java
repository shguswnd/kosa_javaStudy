import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = new int[10];
		
		int sum =0;
		double average = 0;
		System.out.println("·£´ýÇÑ Á¤¼öµé : ");
		for(int i=0; i<10;i++)
		{
			arr[i] = (int)((Math.random()*10)+1);
			sum += arr[i];
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		average = sum/10.0;
		System.out.printf("Æò±ÕÀº %f", average);
	}

}
