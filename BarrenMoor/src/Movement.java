
public class Movement {
	AdvMap mapGrid = new AdvMap();
	PlayerPosition player = new PlayerPosition();

	public void moveNorth() {
		System.out.println("You move North.");
		// mapGrid.map[mapGrid.playerIsX][mapGrid.playerIsY] =
		// mapGrid.map[mapGrid.playerIsX][mapGrid.playerIsY - 1];
		mapGrid.setPlayerIsY(player.playerX--);

	}

	public void moveEast() {
		mapGrid.map[mapGrid.playerIsX][mapGrid.playerIsY] = mapGrid.map[mapGrid.playerIsX + 1][mapGrid.playerIsY];
	}

	public void moveSouth() {
		mapGrid.map[mapGrid.playerIsX][mapGrid.playerIsY] = mapGrid.map[mapGrid.playerIsX][mapGrid.playerIsY + 1];
	}

	public void moveWest() {
		mapGrid.map[mapGrid.playerIsX][mapGrid.playerIsY] = mapGrid.map[mapGrid.playerIsX - 1][mapGrid.playerIsY];
	}
}
