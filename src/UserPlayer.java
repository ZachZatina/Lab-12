import java.util.Scanner;

public class UserPlayer extends Player {

	@Override
	public Roshambo generateRoshambo() {
		Scanner scnr = new Scanner(System.in);
		boolean isValid = false;
		while (isValid == false) {
			System.out.print("ROCK, PAPER, or SCISSORS: ");
			String userChoice = scnr.nextLine();
			if (userChoice.equalsIgnoreCase("ROCK")) {
				isValid = true;
				//scnr.close();
				return Roshambo.ROCK;
			} else if (userChoice.equalsIgnoreCase("PAPER")) {
				isValid = true;
				//scnr.close();
				return Roshambo.PAPER;
			} else if (userChoice.equalsIgnoreCase("SCISSORS")) {
				isValid = true;
				//scnr.close();
				return Roshambo.SCISSORS;
			} else {
				System.out.println("That is not a valid input try again.");
			}
		}
		//scnr.close();
		return null;

	}

}
