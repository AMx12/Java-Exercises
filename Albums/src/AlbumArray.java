import java.util.ArrayList;

public class AlbumArray {

	public static void main(String[] args) {
		AlbumArray search = new AlbumArray();
		ArrayList<AlbumInfo> AlbumList = new ArrayList<>();

		AlbumInfo AlbumOne = new AlbumInfo("Tell Your World", "livetune", 12);
		AlbumInfo AlbumTwo = new AlbumInfo("Greatest Idol", "Mitchie M", 13);
		AlbumInfo AlbumThree = new AlbumInfo("Conti New", "DECO*27", 12);
		AlbumInfo AlbumFour = new AlbumInfo("Thirty", "HiroyukiODA", 9);
		AlbumInfo AlbumFive = new AlbumInfo("Re:start", "livetune", 11);

		AlbumList.add(AlbumOne);
		AlbumList.add(AlbumTwo);
		AlbumList.add(AlbumThree);
		AlbumList.add(AlbumFour);
		AlbumList.add(AlbumFive);

		// System.out.println(AlbumList);

		// for (AlbumInfo arrayCount : AlbumList) {
		// System.out.println(arrayCount);
		// }

		System.out.println(search.AlbumSearch(AlbumList, "DECO*27"));

	}

	public AlbumInfo AlbumSearch(ArrayList<AlbumInfo> AlbumList, String searchInfo) {
		for (AlbumInfo arrayCount : AlbumList) {
			if (arrayCount.albumArtist.equals(searchInfo)) {
				return arrayCount;
			}
		}

		return null;
	}
}
