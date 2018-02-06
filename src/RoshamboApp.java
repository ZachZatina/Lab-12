import java.util.Scanner;

public class RoshamboApp {

	public static void main(String[] args) {
		
		// variable list
		RockPlayer p1;
		RandomPlayer p2;
		String cont = "y";
		UserPlayer u = new UserPlayer();
		Roshambo userRosh;
		Roshambo compRosh;
		
		// user intro
		System.out.println("Welcome to ROSHAMBO SHOWDOWN");
		System.out.println("");

		System.out.print("Enter your name: ");

		Scanner scnr = new Scanner(System.in);

		String name = scnr.nextLine();
		
		// lets the user choose who to play against based on number input
		System.out.print("Would you like to play against The Rock (1) or The Riddler (2): ");
		
		int playerType = scnr.nextInt();
		scnr.nextLine();
		
		// if loop for the first choice
		if (playerType == 1) {
			// creates the class to call the correct class
			p1 = new RockPlayer();
			// loop to continue playing
			while (cont.equalsIgnoreCase("Y")) {
				System.out.println("");
				// generates the choice for the user
				userRosh = u.generateRoshambo();
				// generates the throw for the computer (always rock)
				compRosh = p1.generateRoshambo();
				
				// throws output
				System.out.println(name + ": " + userRosh.toString());
				System.out.println("The Rock: " + compRosh.toString());
				
				// results output
				if (userRosh.toString().equalsIgnoreCase(compRosh.toString())) {
					System.out.println("Draw!");
				} else if (userRosh.toString().equalsIgnoreCase("Paper")) {
					System.out.println(name + " wins!");
				} else {
					System.out.println("The Rock wins!");
				}

				System.out.print("Play again? (y/n): ");
				cont = scnr.nextLine();
			}
			System.out.println("Goodbye!");
			
			// part for second computer player (random) mostly same as if statement for computer player (rock) above.
		} else if (playerType == 2) {
			p2 = new RandomPlayer();
			while (cont.equalsIgnoreCase("Y")) {
				System.out.println("");
				userRosh = u.generateRoshambo();
				compRosh = p2.generateRoshambo();

				System.out.println(name + ": " + userRosh.toString());
				System.out.println("The Riddler: " + compRosh.toString());
				
				// if statement for draws
				if (userRosh.toString().equalsIgnoreCase(compRosh.toString())) {
					System.out.println("Draw!");
					// this else if accounts for all user winning hands
				} else if ((userRosh.toString().equalsIgnoreCase("Paper")
						&& compRosh.toString().equalsIgnoreCase("Rock"))
						|| (userRosh.toString().equalsIgnoreCase("Rock")
								&& compRosh.toString().equalsIgnoreCase("Scissors"))
						|| (userRosh.toString().equalsIgnoreCase("Scissors")
								&& compRosh.toString().equalsIgnoreCase("Paper"))) {
					System.out.println(name + " wins!");
					// else for rest of outcomes
				} else {
					System.out.println("The Riddler wins!");
				}

				System.out.print("Play again? (y/n): ");
				cont = scnr.nextLine();
			}
			System.out.println("Goodbye!");

		}
		
		scnr.close();

	}

}
