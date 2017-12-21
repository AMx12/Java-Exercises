
public class Game {

	private final int WIN = 2;
	private final int DRAW = 1;
	private final int LOSE = 0;

	public Player game(Player p1, Player p2, int bestOf) {
		int p1Score = 0;
		int p2Score = 0;
		
		int winningScore = (int) Math.ceil(bestOf/2.f);
		
		int round = 1;
		
		System.out.println("Rock, Paper, Scissors! First to: " + winningScore);
		
		while (p1Score < winningScore && p2Score < winningScore) {
			
			System.out.printf("\nRound %d %s : %d | %s : %d\n", round, p1.getName(), p1Score, p2.getName(), p2Score);
			Move p1Hand = p1.playerTurn();
			Move p2Hand = p2.playerTurn();
			
			System.out.println();
			System.out.println(p1.getName() + " used " + p1Hand);
			System.out.println(p2.getName() + " used " + p2Hand);
			System.out.println();
			
			p1.observe(p2Hand);
			p2.observe(p1Hand);

			int handResult = result(p1Hand, p2Hand);

			if (handResult == WIN) {
				System.out.println(p1.getName() + " wins the round.");
				p1Score++;
			}
			else if (handResult == LOSE) {
				System.out.println(p2.getName() + " wins the round.");
				p2Score++;
			}
			else {
				System.out.println("It's a draw...");
			}
			
			round++;
		}
		System.out.printf("\n%s : %d | %s : %d\n\n", p1.getName(), p1Score, p2.getName(), p2Score);
		
		if (p1Score == winningScore) {
			System.out.println(p1.getName() + " wins the game!");
			return p1;
		}
		else {
			System.out.println(p2.getName() + " wins the game!");
			return p2;
		}
	}

	private int result(Move p1Hand, Move p2Hand) {
		switch (p1Hand) {
		case PAPER:
			switch (p2Hand) {
			case PAPER:
				return DRAW;
			case ROCK:
				return WIN;
			case SCISSORS:
				return LOSE;
			}
		case ROCK:
			switch (p2Hand) {
			case PAPER:
				return LOSE;
			case ROCK:
				return DRAW;
			case SCISSORS:
				return WIN;

			}
		case SCISSORS:
			switch (p2Hand) {
			case PAPER:
				return WIN;
			case ROCK:
				return LOSE;
			case SCISSORS:
				return DRAW;

			}

		}

		return 0;
	}
}
