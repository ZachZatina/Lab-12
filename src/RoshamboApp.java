import java.util.Scanner;

public class RoshamboApp {

	public static void main(String[] args) {

		RockPlayer p1;
		RandomPlayer p2;
		String cont = "y";
		UserPlayer u = new UserPlayer();
		Roshambo userRosh;
		Roshambo compRosh;

		System.out.println("Welcome to ROSHAMBO SHOWDOWN");
		System.out.println("");

		System.out.print("Enter your name: ");

		Scanner scnr = new Scanner(System.in);

		String name = scnr.nextLine();

		System.out.print("Would you like to play against The Rock (1) or The Riddler (2): ");

		int playerType = scnr.nextInt();
		scnr.nextLine();

		if (playerType == 1) {
			p1 = new RockPlayer();
			while (cont.equalsIgnoreCase("Y")) {
				System.out.println("");
				userRosh = u.generateRoshambo();
				compRosh = p1.generateRoshambo();

				System.out.println(name + ": " + userRosh.toString());
				System.out.println("The Rock: " + compRosh.toString());

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

		} else if (playerType == 2) {
			p2 = new RandomPlayer();
			while (cont.equalsIgnoreCase("Y")) {
				System.out.println("");
				userRosh = u.generateRoshambo();
				compRosh = p2.generateRoshambo();

				System.out.println(name + ": " + userRosh.toString());
				System.out.println("The Riddler: " + compRosh.toString());

				if (userRosh.toString().equalsIgnoreCase(compRosh.toString())) {
					System.out.println("Draw!");
				} else if ((userRosh.toString().equalsIgnoreCase("Paper")
						&& compRosh.toString().equalsIgnoreCase("Rock"))
						|| (userRosh.toString().equalsIgnoreCase("Rock")
								&& compRosh.toString().equalsIgnoreCase("Scissors"))
						|| (userRosh.toString().equalsIgnoreCase("Scissors")
								&& compRosh.toString().equalsIgnoreCase("Paper"))) {
					System.out.println(name + " wins!");
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
