package logical;

import java.util.Scanner;

public class logicalstatements1 {

	public static void main(String[] args) {
	System.out.println("main method started");
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter your age: ");
	int age = sc.nextInt();
	if (age >=18)
		System.out.println("Welcome to the elders community !!");
System.out.println("your eligible for voting & driving !!");
System.out.println("main method ended");
	sc.close();
	}

}
