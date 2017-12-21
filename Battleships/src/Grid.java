import java.util.Random;

public class Grid {

	private final int NORTH = 0;
	private final int EAST = 1;
	private final int SOUTH = 2;
	private final int WEST = 3;

	Random ran = new Random();
	Destroyer destroy = new Destroyer();
	Placement move = new Placement();

	public int maximumShots = 3;
	int gridX = 5;
	int gridY = gridX;

	char[][] gameGrid = new char[gridX][gridY];

	public void initialiseGrid() {
		// Loops through every column
		for (int i = 0; i < gameGrid.length; i++) {
			// Loops through the row
			for (int j = 0; j < gameGrid.length; j++) {
				// Initialises every cell as " "
				gameGrid[i][j] = ' ';
			}
		}
	}

	public int chooseRandomDirection() {
		return ran.nextInt(4);
	}

	public int ranPos() {
		return ran.nextInt(gameGrid.length);
	}

	public boolean checkIfOpen(int inputX, int inputY) {
		boolean isOpen = false;

		if (gameGrid[inputX][inputY] == ' ') {
			isOpen = true;
		}

		return isOpen;
	}

	public int checkIfValidDirection(int inputX, int inputY, int direction) {

		// WHATS GOING ON HERE

		int validPosition = -1;

		switch (direction) {
		case NORTH:
			if (inputY - 1 >= 0) {
				validPosition = NORTH;
			}
		case EAST:
			if (inputX + 1 < gameGrid.length) {
				validPosition = EAST;
			}
		case SOUTH:
			if (inputY + 1 < gameGrid.length) {
				validPosition = SOUTH;
			}
		case WEST:
			if (inputX - 1 >= 0) {
				validPosition = WEST;
			}
		}

		return validPosition;
	}

	public void placeRandomDestroyer() {
		int shipX = ranPos();
		int shipY = ranPos();
		boolean inBounds = false;

		while (!checkIfOpen(shipX, shipY)) {
			shipX = ranPos();
			shipY = ranPos();
		}

		gameGrid[shipX][shipY] = 'D';

		// Check if its in bounds
		while (!inBounds) {
			int ranDirection = chooseRandomDirection();
			switch (checkIfValidDirection(shipX, shipY, ranDirection)) {
			case NORTH:
				if (checkIfOpen(shipX, shipY - 1)) {
					gameGrid[shipX][shipY - 1] = 'D';
					inBounds = true;
				}
				break;
			case EAST:
				if (checkIfOpen(shipX + 1, shipY)) {
					gameGrid[shipX + 1][shipY] = 'D';
					inBounds = true;
				}
				break;
			case SOUTH:
				if (checkIfOpen(shipX, shipY + 1)) {
					gameGrid[shipX][shipY + 1] = 'D';
					inBounds = true;
				}
				break;
			case WEST:
				if (checkIfOpen(shipX - 1, shipY)) {
					gameGrid[shipX - 1][shipY] = 'D';
					inBounds = true;
				}
				break;
			}
		}
	}

	// X and Y are purposefully inverse here.
	public void takeShot(int playerShotY, int playerShotX) {
		if (checkIfOpen(playerShotX, playerShotY)) {
			gameGrid[playerShotX][playerShotY] = '~';
			System.out.println("\nMiss!");
		} else {
			gameGrid[playerShotX][playerShotY] = '#';
			System.out.println("\nHit!");
		}
	}

	public String displayGrid() {
		String mapOutput = "    ";
		for (int count = 0; count < gameGrid.length; count++) {
			mapOutput += (count + 1) + "    ";
		}
		mapOutput += "\n";
		// Loops through every row
		for (int i = 0; i < gameGrid.length; i++) {
			mapOutput += (i + 1) + " ";
			// Loops through the column
			for (int j = 0; j < gameGrid.length; j++) {
				// Prints the contents of each cell
				mapOutput += " [" + gameGrid[i][j] + "] ";
			}
			// Adds a new line for each row
			mapOutput += "\n\n";
		}
		return mapOutput;
	}

}