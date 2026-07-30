package ternaryoperator;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter second number: ");
		int num2 = sc.nextInt();
		System.out.println("Enter operator(+ or -): ");
		char op = sc.next().charAt(0);
		int result = (op == '+') ?
				(num1 + num2) : (num1 - num2);
		System.out.println("Result: " +result);
sc.close();			
		}
	}
