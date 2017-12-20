import java.util.ArrayList;
import java.util.Random;

public class AI extends Player {
	
	Random ran = new Random();
	ArrayList<Move> moveHistory = new ArrayList<Move>();
	double weight;
	

	public AI(String name, double weight) {
		super(name);
		this.weight = weight;
	}

	@Override
	public Move playerTurn() {
		
		Move m = Move.values()[ran.nextInt(3)];
		
		if (moveHistory.isEmpty() || Math.random() < weight) return m;
		
		int rockCount = 0, paperCount = 0, scissorsCount = 0;
		
		for (Move move : moveHistory) {
			switch(move) {
			case PAPER:
				paperCount++;
				break;
			case ROCK:
				rockCount++;
				break;
			case SCISSORS:
				scissorsCount++;
				break;
			}
		}
		
		if (rockCount > paperCount && rockCount > scissorsCount) {
			return Move.PAPER;
		}
		if (paperCount > rockCount && paperCount > scissorsCount) {
			return Move.SCISSORS;
		}
		return Move.ROCK;
	}

	@Override
	public void observe(Move opponentsMove) {
		moveHistory.add(opponentsMove);
	}

}
