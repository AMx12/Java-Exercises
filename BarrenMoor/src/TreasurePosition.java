import java.util.Random;

public class TreasurePosition {
	Random ran = new Random();
	public int treasureX = 0;
	public int treasureY = 0;

	public void createTreasure() {
		treasureX = ran.nextInt(3);
		treasureY = ran.nextInt(3);
	}
}
