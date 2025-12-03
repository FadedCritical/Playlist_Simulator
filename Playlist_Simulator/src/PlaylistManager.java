import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class PlaylistManager implements IPlaylist {
    private ArrayList<Song> playlist;

    public PlaylistManager()  {
        String filePath = "Playlist_Simulator\\songs_list.csv";
        try {
            this.playlist = getPlaylist(filePath);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
        try {
            filePath = "Playlist_Simulator\\Playlist_Simulator\\songs_list.csv";
            this.playlist = getPlaylist(filePath);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
        try {
            filePath = "Playlist_Simulator/Playlist_Simulator/songs_list.csv";
            this.playlist = getPlaylist(filePath);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }

    private ArrayList<Song> getPlaylist(String filePath) throws FileNotFoundException {
        ArrayList<Song> list = new ArrayList<>();
        Scanner scanner = new Scanner(new File(filePath));
        scanner.useDelimiter(",");
        scanner.nextLine(); // Skip header line
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] attributes = line.split(",");
            String songName = attributes[0];
            int durationInSeconds = Integer.parseInt(attributes[1]);
            String artistName = attributes[2];
            String genre = attributes[3];
            Song song = new Song(songName, durationInSeconds, artistName, genre);
            list.add(song);
        }
        scanner.close();
        return list;
    }

    @Override
    public void addSong(Song song) {
        playlist.add(song);
    }

    @Override
    public void removeSong(Song song) {
        playlist.remove(song);
    }

    @Override
    public Song getSong(int index) {
        if (index >= 0 && index < playlist.size()) {
            return playlist.get(index);
        }
        return null;
    }

    @Override
    public int getTotalDuration() {
        int totalDuration = 0;
        for (Song song : playlist) {
            totalDuration += song.GetdurationInSeconds();
        }
        return totalDuration;
    }

    @Override
    public void shuffle() {
        java.util.Collections.shuffle(playlist);
    }

    @Override
    public void savePlaylist(String filePath) {
        try (java.io.PrintWriter writer = new java.io.PrintWriter(new java.io.File(filePath))) {
            writer.println("Song Name,Duration (seconds),Artist Name,Genre");
            for (Song song : playlist) {
                writer.printf("%s,%d,%s,%s%n", song.GetSongName(), song.GetdurationInSeconds(), song.GetArtistName(),
                        song.GetGenre());
            }
        } catch (java.io.FileNotFoundException e) {
            System.out.println("Error saving playlist: " + e.getMessage());
        }
    }
}
