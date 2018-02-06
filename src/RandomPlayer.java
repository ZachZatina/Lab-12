
public class RandomPlayer extends Player {

	@Override
	public Roshambo generateRoshambo() {
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
