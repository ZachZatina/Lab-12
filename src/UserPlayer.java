import java.util.Scanner;

public class UserPlayer extends Player {

	@Override
	public Roshambo generateRoshambo() {
		Scanner scnr = new Scanner(System.in);
		boolean isValid = false;
		// loop for validation
		while (isValid == false) {
			// prompts for user throw
			System.out.print("ROCK, PAPER, or SCISSORS: ");
			String userChoice = scnr.nextLine();
			// conditional converting string to roshambo value
			if (userChoice.equalsIgnoreCase("ROCK")) {
				isValid = true;
				return Roshambo.ROCK;
			} else if (userChoice.equalsIgnoreCase("PAPER")) {
				isValid = true;
				return Roshambo.PAPER;
			} else if (userChoice.equalsIgnoreCase("SCISSORS")) {
				isValid = true;
				return Roshambo.SCISSORS;
				// validation statement
			} else {
				System.out.println("That is not a valid input try again.");
			}
		}
		return null;

	}

}
