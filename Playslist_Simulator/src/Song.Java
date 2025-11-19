public class Song {
    private String songName;
    private String durationInSeconds;
    private String artistName;
    private int genre;

    public Song(String songName, String durationInSeconds, String artistName, int genre) {
        this.songName = songName;
        this.durationInSeconds = durationInSeconds;
        this.artistName = artistName;
        this.genre = genre;
    }

    public String GetSongName() {
        return songName;
    }

    public String GetdurationInSeconds() {
        return durationInSecondst;
    }

    public String GetArtistName() {
        return artistName;
    }

    public int GetGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "Song{" +
                "Song: " + songName + '\'' +
                ", Duration: " + durationInSeconds + 'seconds\'' +
                ", Artist:'" + artist + '\'' +
                ", Genre:" + genre +
                '}';
    }
}