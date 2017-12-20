
public abstract class Player {

	private String name;

	public String getName() {
		return name;
	}

	public Player(String name) {
		super();
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract Move playerTurn();
	
	public abstract void observe(Move opponentsMove); 

}
