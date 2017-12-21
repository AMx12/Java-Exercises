import java.util.Scanner;

public class Battleships {

	static Battleships main = new Battleships();
	static Grid grid = new Grid();
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		grid.initialiseGrid();
		grid.placeRandomDestroyer();
		grid.placeRandomDestroyer();
		System.out.println(grid.displayGrid());

		for (int i = 0; i < grid.maximumShots; i++) {
			System.out.print("Choose a row to fire on: ");
			int playerShotX = scanner.nextInt() - 1;
			System.out.print("\nChoose a column to fire on: ");
			int playerShotY = scanner.nextInt() - 1;

			grid.takeShot(playerShotX, playerShotY);
			System.out.println(grid.displayGrid());
		}

	}
}
