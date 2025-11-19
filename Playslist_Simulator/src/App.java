import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try {
            ArrayList<Song> songs = getSongs("songs_list.csv");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }

    
    public static  ArrayList<Song> getSongs(String filePath) throws FileNotFoundException {
        ArrayList<Song> songs = new ArrayList<>();
        Scanner scanner = new Scanner(new File(filePath));
        scanner.useDelimiter(",");
        scanner.nextLine(); // Skip header line
        while (scanner.hasNext()) {
            songs.add(new Song(scanner.next(), scanner.next(), scanner.next(), scanner.nextInt()));
        }
        scanner.close();
        return songs;
    }
    
}
