import java.util.Scanner;

import Study01_Package.Sum;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		
		
		Sum sum = new Sum();
		
		sum.sum(n);
		
		sum.print();
		
	}

}
