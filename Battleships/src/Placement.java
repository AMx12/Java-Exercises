
public class Placement {

	public boolean placeNorth(int shipX, int shipY, boolean isOpen) {
		if (shipY - 1 >= 0) {
			if (isOpen) {
				// gameGrid[shipX][shipY - 1] = 'D';
				// inBounds = true;
			}
		}
		return isOpen;

	}

	public void placeEast() {

	}

	public void placeSouth() {

	}

	public void placeWest() {

	}

	public void placeRandom() {

	}

}
