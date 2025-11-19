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

    public String getdurationInSeconds() {
        return durationInSecondst;
    }

    public String getartistName() {
        return artistName;
    }

    public int getgenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "Song{" +
                "Song: " + songName + '\'' +
                ", Duration: " + durationInSeconds + 'seconds\'' +
                ", Artist:'" + album + '\'' +
                ", Genre:" + year +
                '}';
    }
}