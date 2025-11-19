import java.util.Iterator;

public class Song implements Iterable<Song> {
    private String songName;
    private int durationInSeconds;
    private String artistName;
    private String genre;

    public Song(String songName, int durationInSeconds, String artistName, String genre) {
        this.songName = songName;
        this.durationInSeconds = durationInSeconds;
        this.artistName = artistName;
        this.genre = genre;
    }

    public String GetSongName() {
        return songName;
    }

    public int GetdurationInSeconds() {
        return durationInSeconds;
    }

    public String GetArtistName() {
        return artistName;
    }

    public String GetGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "Song{" +
                "Song: " + songName + '\'' +
                ", Duration: " + durationInSeconds + " seconds\'" +
                ", Artist:" + artistName + '\'' +
                ", Genre:" + genre +
                '}';
    }

    @Override
    public Iterator<Song> iterator() {
        return new Iterator<Song>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < 1;
            }

            @Override
            public Song next() {
                if (!hasNext()) {
                    throw new IllegalStateException("No more elements");
                }
                index++;
                return Song.this;
            }
        };
    }
}