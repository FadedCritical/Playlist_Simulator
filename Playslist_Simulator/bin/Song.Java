public class Song {
    private String songName;
    private String durationInSeconds;
    private String artistName;
    private int genre;

    public Song(String songName, String durationInSeconds, String artistName, int genre) {
        this.songName = songName;
        this.durationInSeconds = durationInSeconds;
        this.album = album;
        this.year = year;
    }

    public String getSongName() {
        return songName;
    }

    public String getArtist() {
        return artisdurationInSecondst;
    }

    public String getAlbum() {
        return album;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Song{" +
                "Song Name='" + songName + '\'' +
                ", duration='" + durationInSeconds + '\'' +
                ", album='" + album + '\'' +
                ", year=" + year +
                '}';
    }
}