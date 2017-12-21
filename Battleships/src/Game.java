import java.util.Scanner;

public class Game {

	Grid grid = new Grid();
	Scanner scanner = new Scanner(System.in);

	public void startGame() {
		grid.initialiseGrid();
		grid.placeRandomDestroyer();
		grid.placeRandomDestroyer();
		System.out.println(grid.displayGrid());
	}

	public void playGame() {
		for (int i = 0; i < grid.maximumShots; i++) {
			System.out.println("Shots remaining: " + (grid.maximumShots - i));
			System.out.print("Choose a row to fire on: ");
			int playerShotX = scanner.nextInt() - 1;
			System.out.print("\nChoose a column to fire on: ");
			int playerShotY = scanner.nextInt() - 1;

			grid.takeShot(playerShotX, playerShotY);
			System.out.println(grid.displayGrid());
		}

		System.out.println("Out of shots!");
		scanner.close();
	}

}
