
public class Movement {
	AdvMap mapGrid = new AdvMap();

	public void moveNorth() {
		mapGrid.map[mapGrid.playerIsX][mapGrid.playerIsY] = mapGrid.map[mapGrid.playerIsX][mapGrid.playerIsY - 1];
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
