package jan_05;

import java.util.Scanner;

public class OddEvenMethod {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number to verify for odd or even");
		int num = sc.nextInt();
		
		sc.close();
		
		if(num%2==0) {
			System.out.println("Entered number is even");
		}
		else
			System.out.println("Entered number is Odd");
	}
	

}
