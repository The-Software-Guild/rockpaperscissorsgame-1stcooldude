import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		String play = "Yes";
		while (play.equals("Yes")){
			Scanner input = new Scanner(System.in);
	
			System.out.println("How many rounds would you like to play? (1-10)");
			int rounds = 0;
			try {
				rounds = input.nextInt();
			} catch (Exception e) {
				System.out.println("Error: Invalid input");
				return;
			}
			if (rounds < 1 || rounds > 10) {
				System.out.println("Error: Invalid input");
				return;
			}
	
			System.out.println("Rounds: " + rounds);
	
			Random rng = new Random();
			int win = 0, lose = 0, tie = 0;
			int randomNumber;
	
			for (int i = 0; i < rounds; i++) {
				System.out.println("Rock (1), Paper (2) or scissors(3)?");
				int choice = 0;
				try {
					choice = input.nextInt();
				} catch (Exception e) {
					System.out.println("Error: Invalid input");
					return;
				}
				if (choice < 1 || choice > 3) {
					System.out.println("Error: Invalid input");
					return;
				}
				randomNumber = rng.nextInt(3) + 1;
				System.out.println("I choose: " + randomNumber);
				if (choice == randomNumber) {
					tie++;
					System.out.println("Tie!");
				} else if ((choice - randomNumber + 3) % 3 == 1) {
					win++;
					System.out.println("You won!");
				} else {
					lose++;
					System.out.println("I won!");
				}
				
			}
			System.out.println("-------------");
	
			System.out.println("Win: " + win);
			System.out.println("Lose: " + lose);
			System.out.println("Tie: " + tie);
			
			System.out.println("-------------");
	
			if (win > lose) {
				System.out.println("You win");
			} else if (lose > win) {
				System.out.println("You lose");
			} else {
				System.out.println("It's a tie");
			}
	
			System.out.println("Would you like to play again? ");
			play = input.next();
		}

	}

}
