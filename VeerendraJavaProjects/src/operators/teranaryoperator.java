package operators;

import java.util.Scanner;

public class teranaryoperator {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		String result =(num >= 0) ?
				"positive" : "Negative";
		System.out.println("The number is: " + result);
		sc.close();
	}
	
	

}
