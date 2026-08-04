package Movie;

import java.util.Scanner;

public class movie {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Select Ticket Type");
		System.out.println("1.Silver - Rs.200");
		System.out.println("2.Gold - Rs.300");
		System.out.println("3.platinum - Rs.400");
		System.out.println("4.Exit");
		System.out.println("Enter your Choise: ");
		int Choise = sc.nextInt();
		switch (Choise) {
		case 1:
			System.out.println("Enter your Age: ");
			int age1 = sc.nextInt();
			double silverprice = 200;
			if (age1 >=60) {
				silverprice =silverprice -(silverprice*10/100);
			}
			System.out.println("silver ticket price: ");
			break;
		case 2:
			System.out.println("Enter your age: ");
			int age2 = sc.nextInt();
			double goldprice = 300;
			if (age2 >=60) {
				goldprice =goldprice -(goldprice*10/100);
			}
			System.out.println("Gold ticket price: Rs." +goldprice);
			break;
		case 3:
			System.out.println("Enter your age: ");
			int age3 = sc.nextInt();
			double platinum = 400;
			if (age3 >=60) {
				platinum =platinum -(platinum*10/100);
			}
			System.out.println("Thank you! visit Again.");
			break;
			default:
				System.out.println("Invalid ticket choice.");
		}
		sc.close();
	}
}
		
			
			
			
			
			
		

	
