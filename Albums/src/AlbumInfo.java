
public class AlbumInfo {
	public String albumName;
	public String albumArtist;
	public int trackCount;

	public AlbumInfo(String albumName, String albumArtist, int trackCount) {
		this.albumName = albumName;
		this.albumArtist = albumArtist;
		this.trackCount = trackCount;
	}

	public String toString() {
		return "Album Name: " + this.albumName + ", Artist: " + this.albumArtist + ", Tracks: " + this.trackCount;
	}
}