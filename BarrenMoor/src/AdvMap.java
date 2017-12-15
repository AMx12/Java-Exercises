public class AdvMap {

	MapInformation mapInfo = new MapInformation();
	PlayerPosition player = new PlayerPosition();
	TreasurePosition treasure = new TreasurePosition();

	int mapX = 3;
	int mapY = 3;

	public int playerIsX = -1;
	public int playerIsY = -1;

	int[][] map = new int[mapX][mapY];

	public void createMap() {
		// Loops through every column
		for (int i = 0; i < map.length; i++) {
			// Loops through the row
			for (int j = 0; j < map.length; j++) {
				// Initialises every cell as 0
				map[i][j] = 0;
			}
		}
	}

	public int getMapX() {
		return mapX;
	}

	public int getMapY() {
		return mapY;
	}

	public void placePlayer() {
		map[player.playerX][player.playerY] = 1;
	}

	public void placeTreasure() {
		map[treasure.treasureX][treasure.treasureY] = 2;
	}

	public void startGame() {
		createMap();
		placePlayer();
		placeTreasure();
	}

	public String strPlayerIsHere() {
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map.length; j++) {
				if (map[i][j] == 1) {
					playerIsX = i;
					playerIsY = j;
					return "You are at: " + i + ", " + j;
				}
			}
		}
		return null;
	}

	public String strTreasureIsHere() {
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map.length; j++) {
				if (map[i][j] == 2) {
					return "The treasure is at: " + i + ", " + j;
				}
			}
		}
		return null;
	}
}
