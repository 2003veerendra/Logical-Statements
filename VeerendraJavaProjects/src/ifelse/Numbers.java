package ifelse;

import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
				if (num >=10 && num<=99) {
			System.out.println("Two digit number");
		}else if (num >= 100 && num<=999) {
			System.out.println("Three digit number");
		}else if (num >=1000) {
			System.out.println("More than three digits");
		} else {
			System.out.println("Less than two digits");
		}
		

	
sc.close();
}}
