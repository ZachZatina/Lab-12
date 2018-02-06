
public class RandomPlayer extends Player {

	@Override
	public Roshambo generateRoshambo() {
		// gets a random number from 0 to 2 and applies to the switch statement getting a roshambo value back
		int randNum = (int) (Math.random() * 3);
		
		switch(randNum) {
		case 0:
			return Roshambo.PAPER;
		case 1:
			return Roshambo.ROCK;
		case 2:
			return Roshambo.SCISSORS;
		default:
			return null;	
		}
	}

}
