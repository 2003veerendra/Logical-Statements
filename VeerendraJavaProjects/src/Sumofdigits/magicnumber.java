package Sumofdigits;

import java.util.Scanner;

public class magicnumber {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner (System.in)) {
			System.out.println("Enter a number : ");
			int n= sc.nextInt();
			while (n>9) {
				int sum = 0;
				while (n>0) {
					int digit = n % 10;
					sum = sum + digit;
					n = n/10;
				}
				n = sum;
			}
			if (n==1)
System.out.println("Magic Number");
			else
				System.out.println("Not a magic number");
		}
		}

	}

