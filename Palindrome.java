import java.util.Scanner;

public class Palindrome {
	
	
	/*
	 Its a program witch check if a word is a palidrome, 
	 thats mean, that in reverse is the same word.
	 You can write: 
	 -word, -phrase -numbers
	 Program is constructed in such way, that ignore whitespace or camelcase.
	 And it will check it for you.
	 */

	public static void main(String[] args) {

		System.out.print("Hello in program for checking if a word, phraseis a palindrome." + "\n");
		System.out.println("Please enter word or phrase that you want to check:");

		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();

		String stringReversed = new StringBuilder(input).reverse().toString();
		System.out.println("Your word in reverse is: " + stringReversed);
		System.out.println("Is it palindrome?");

		if (stringReversed.replaceAll(" ", "").equalsIgnoreCase(input.replaceAll(" ", ""))) {
			System.out.println("Word: " + "`" + input + "`" + " Yes it`s a palindrome" + "\n");

		}

		else
			System.out.println("Word: " + "`" + input + "`" + " Isn`t a palidrome :)" + "\n");

	}
}
