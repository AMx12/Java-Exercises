
public class Game {

	private final int WIN = 2;
	private final int DRAW = 1;
	private final int LOSE = 0;

	public Player game(Player p1, Player p2, int bestOf) {
		int s1 = 0;
		int s2 = 0;
		
		int winningScore = (int) Math.ceil(bestOf/2.f);
		
		int round = 1;
		
		System.out.println("Rock, Paper, Scissors! First to: " + winningScore);
		
		while (s1 < winningScore && s2 < winningScore) {
			
			System.out.printf("\nRound %d %s : %d | %s : %d\n", round, p1.getName(), s1, p2.getName(), s2);
			Move m1 = p1.playerTurn();
			Move m2 = p2.playerTurn();
			
			System.out.println();
			System.out.println(p1.getName() + " used " + m1);
			System.out.println(p2.getName() + " used " + m2);
			System.out.println();
			
			p1.observe(m2);
			p2.observe(m1);

			int x = result(m1, m2);

			if (x == WIN) {
				System.out.println(p1.getName() + " wins the round.");
				s1++;
			}
			else if (x == LOSE) {
				System.out.println(p2.getName() + " wins the round.");
				s2++;
			}
			else {
				System.out.println("It's a draw...");
			}
			
			round++;
		}
		System.out.printf("\n%s : %d | %s : %d\n\n", p1.getName(), s1, p2.getName(), s2);
		
		if (s1 == winningScore) {
			System.out.println(p1.getName() + " wins the game!");
			return p1;
		}
		else {
			System.out.println(p2.getName() + " wins the game!");
			return p2;
		}
	}

	private int result(Move m1, Move m2) {
		switch (m1) {
		case PAPER:
			switch (m2) {
			case PAPER:
				return DRAW;
			case ROCK:
				return WIN;
			case SCISSORS:
				return LOSE;
			}
		case ROCK:
			switch (m2) {
			case PAPER:
				return LOSE;
			case ROCK:
				return DRAW;
			case SCISSORS:
				return WIN;

			}
		case SCISSORS:
			switch (m2) {
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
