package numberGuesser;
import java.util.Scanner;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Guess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int min = 1;
		int max = 10;
		int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);		
		Scanner myObj = new Scanner(System.in);
		//Random rd = new Random();
		
		// user guesses a number between 1 and 10
		int i = 0;
		for (i = 0; i < 10; i++) {
		
		System.out.println("Choose a number 1 - 10: ");
		int numGuessed = myObj.nextInt();
		System.out.println(numGuessed);
		
		if (numGuessed == randomNum) {
			System.out.println("Correct! You win!");
			break;
			
		} else {
			
			System.out.println("Wrong! Try again!");
			
		}
		}

	}

}
