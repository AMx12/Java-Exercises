import java.util.Scanner;

public class Human extends Player {
	Scanner scan = new Scanner(System.in);

	public Human(String name) {
		super(name);
	}

	@Override
	public Move playerTurn() {

		Move m = null;

		while (m == null) {
			System.out.print("Enter your move: ");
			String playerInput = scan.nextLine();
			if (playerInput.equalsIgnoreCase("rock")) {
				m =  Move.ROCK;
			} else if (playerInput.equalsIgnoreCase("paper")) {
				m =  Move.PAPER;
			} else if (playerInput.equalsIgnoreCase("scissors")) {
				m =  Move.SCISSORS;
			} else {
				System.out.println("Please enter an actual move.");
			}
		}
		return m;
	}

	@Override
	public void observe(Move opponentsMove) {
	}

}
