import java.util.Random;

public class PlayerPosition {
	Random ran = new Random();
	// AdvMap mapGrid = new AdvMap();

	public int playerX = 0;
	public int playerY = 0;

	public void createPlayer() {
		playerX = ran.nextInt(3);
		playerY = ran.nextInt(3);
	}

	public String whereAmI() {
		if (playerX < 0 || playerY < 0) {
			return "You are in the void; go back!";
		} else {
			return "Position: " + playerX + ", " + playerY;
		}
	}

	public String toString() {
		return whereAmI();
	}
}
