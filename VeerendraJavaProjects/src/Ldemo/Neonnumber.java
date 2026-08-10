package Ldemo;

import java.util.Scanner;

public class Neonnumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int square = num *num;
		int temp = square;
		int sum = 0;
		while (temp >0) {
			int digit = temp %10;
			sum = sum + digit;
			temp = temp/10;
		}
		if (sum == num) {
			System.out.println(num + "is a neon number. ");
		} else {
			System.out.println(num + " is not a neon number .");
			
		}
		sc.close();
	}

		
}


