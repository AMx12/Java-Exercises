
public class AdvMain {

	public static void main(String[] args) {
		AdvMap mapGrid = new AdvMap();
		Movement move = new Movement();

		mapGrid.player.createPlayer();
		mapGrid.treasure.createTreasure();
		mapGrid.startGame();

		// System.out.println("By grid co-ords:");
		System.out.println(mapGrid.strPlayerIsHere());
		System.out.println(mapGrid.strTreasureIsHere());
		// System.out.println();
		// System.out.println("By player co-ords:");
		// System.out.println("You are at: " + mapGrid.player.playerX + ", " +
		// mapGrid.player.playerY);
		// System.out.println("The treasure is at: " + mapGrid.treasure.treasureX + ", "
		// + mapGrid.treasure.treasureY);

		// if (mapGrid.player.playerX == mapGrid.treasure.treasureX
		// && mapGrid.player.playerY == mapGrid.treasure.treasureY) {
		// System.out.println("You found it!");
		// } else {
		// System.out.println("The treasure continues to elude you.");
		// }

		if (mapGrid.intPlayerIsHere() == mapGrid.intTreasureIsHere()) {
			System.out.println("You found it!");
		} else {
			System.out.println("The treasure continues to elude you.");
		}

		System.out.println();
		move.moveNorth();
		// System.out.println("By grid co-ords:");
		System.out.println(mapGrid.strPlayerIsHere());
		// System.out.println(mapGrid.intPlayerIsHere());

	}
}