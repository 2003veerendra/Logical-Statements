package Number;

import java.util.Scanner;

public class guessnumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int randomnumber = (int)(Math.random() * 10) + 1;
		System.out.println("Guess a number between 1 and 10. ");
for(int i=1; i<=3; i++)	{
	System.out.println("Attempt"+ i + ": Enter your guess:");
			int guess = sc.nextInt();
	if(guess == randomnumber)
	{
		System.out.println("You won!");
		sc.close();
		return;
	}else {
		System.out.println("wrong guess!");
	}
}
System.out.println("you lost!");
System.out.println("The random number was: " + randomnumber);
sc.close();
	}

		
	}

		


