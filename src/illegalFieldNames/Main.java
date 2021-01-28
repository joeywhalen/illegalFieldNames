package illegalFieldNames;

import java.util.Scanner;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random import = new Random();
		Scanner userInput = new Scanner(System.in);
		int public = 0;
		while (true) {
			rand = import.nextInt(11);
			if(rand !=0) break;
		}
		
		System.out.println("Guess a number between 1 and 10.");
		int guessRand = Integer.parseInt(userInput.nextLine());
		if (public == guessRand) {
			System.out.println("Wow!");
		}	else {
			System.out.println("Nope!  The number was");
			System.out.println(rand);
			System.out.println(public);
			int count = ();
		}
	
	}

}
