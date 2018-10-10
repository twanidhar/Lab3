package labnumber3;

import java.util.Scanner;

public class EvenOddApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		String userInput;
		userInput = scan.nextLine();
		
		System.out.println("Enter a number between 1 and 100");
		int number = scan.nextInt();
		
		if (number%2 ==0 && number <25) {
			System.out.println("Even and less than 25.");
		}else if ((number%2)>= 26 && number%2 >60) {
			System.out.println("Even");
		}else if ((number%2>60)) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
	}

}
