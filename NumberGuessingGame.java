import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

	public static void main(String[] args){
		//Display welcome message
		System.out.println("Welcome to the Number Guessing Game");
		//Prompt upper limit and create a random number
		System.out.println("Enter the upper limit for the number: ");
		Scanner sc = new Scanner(System.in);
		int upperLimit = Integer.parseInt(sc.nextLine());
		System.out.println("OK, I'm thinking of a number between 0 and " + upperLimit);
		//Create a random number
		Random random = new Random();
		int number = random.nextInt(upperLimit - 1) + 1;
		int guess = 0;
		//loop until the user guesses the correct number
		while(guess != number)
		{
			//Prompt the input 
			System.out.println("Enter your guess: ");
			guess = Integer.parseInt(sc.nextLine());
			if(guess > number)
			{
				System.out.println("Your guess is too high.");
			}
			else if(guess < number)
			{
				System.out.println("Your guess is too low.");
			}
			
		}
		System.out.println("Correct!\n");
		
		//close the program
		sc.close();
		System.out.println("Bye!");
	}
}


