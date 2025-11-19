import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Song> songs = getSongs("songs.csv");

    }

    public static ArrayList<Song> getSongs(String filePath) throws FileNotFoundException {
        try {
            ArrayList<Song> songs = new ArrayList<>();
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
                songs.add(song);
            }
            scanner.close();
            return songs;
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
        return null;
    }
}
