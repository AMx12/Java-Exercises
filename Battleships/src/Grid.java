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
	int gridX = 8;
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

	public int checkIfValidDirection(int inputX, int inputY, int direction, int shipLength) {

		// WHATS GOING ON HERE

		int validPosition = -1;

		switch (direction) {
		case NORTH:
			if (inputY - shipLength >= 0) {
				validPosition = NORTH;
			}
		case EAST:
			if (inputX + shipLength < gameGrid.length) {
				validPosition = EAST;
			}
		case SOUTH:
			if (inputY + shipLength < gameGrid.length) {
				validPosition = SOUTH;
			}
		case WEST:
			if (inputX - shipLength >= 0) {
				validPosition = WEST;
			}
		}

		return validPosition;
	}

	public void placeRandomDestroyer(int inputLength) {
		int shipX = ranPos();
		int shipY = ranPos();
		int shipLength = inputLength - 1;
		boolean inBounds = false;

		while (!checkIfOpen(shipX, shipY)) {
			shipX = ranPos();
			shipY = ranPos();
		}

		gameGrid[shipX][shipY] = 'D';

		// Check if its in bounds
		while (!inBounds) {
			int ranDirection = chooseRandomDirection();
			switch (checkIfValidDirection(shipX, shipY, ranDirection, shipLength)) {
			case NORTH:
				if (checkIfOpen(shipX, shipY - shipLength)) {
					for (int i = 1; i <= shipLength; i++) {
						gameGrid[shipX][shipY - i] = 'D';
						inBounds = true;
					}
				}
				break;
			case EAST:
				if (checkIfOpen(shipX + shipLength, shipY)) {
					for (int i = 1; i <= shipLength; i++) {
						gameGrid[shipX + i][shipY] = 'D';
						inBounds = true;
					}
				}
				break;
			case SOUTH:
				if (checkIfOpen(shipX, shipY + shipLength)) {
					for (int i = 1; i <= shipLength; i++) {
						gameGrid[shipX][shipY + i] = 'D';
						inBounds = true;
					}
				}
				break;
			case WEST:
				if (checkIfOpen(shipX - shipLength, shipY)) {
					for (int i = 1; i <= shipLength; i++) {
						gameGrid[shipX - i][shipY] = 'D';
						inBounds = true;
					}
				}
				break;
			}
		}
	}

	// X and Y are purposefully inverse here.
	public void takeShot(int playerShotY, int playerShotX) {
		if (checkIfOpen(playerShotX, playerShotY)) {
			gameGrid[playerShotX][playerShotY] = '~';
			System.out.println("\n" + (playerShotY + 1) + ", " + (playerShotX + 1) + " --> Miss!\n");
		} else {
			gameGrid[playerShotX][playerShotY] = '#';
			System.out.println("\n" + (playerShotY + 1) + ", " + (playerShotX + 1) + " --> Hit!\n");
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