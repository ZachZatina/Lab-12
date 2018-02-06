
public abstract class Player {
	// parent abstract class
	private String name;
	
	public Player() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	public abstract Roshambo generateRoshambo();

}
