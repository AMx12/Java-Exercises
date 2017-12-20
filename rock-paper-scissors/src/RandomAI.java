import java.util.Random;

public class RandomAI extends Player {

	Random ran = new Random();


	public RandomAI(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public Move playerTurn() {
		return Move.values()[ran.nextInt(3)];
	}

	@Override
	public void observe(Move opponentsMove) {
	}
}
