import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try {
            Scanner scanner = new Scanner(new File("songs_list.csv"));
            scanner.useDelimiter(",");
            while (scanner.hasNext()) {
                System.out.print(scanner.next() + " ");
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }

    /*
    public ArrayList<Song> readFile(String filePath) throws FileNotFoundException {
        ArrayList<Song> songs = new ArrayList<>();
        Scanner scanner = new Scanner(new File(filePath));
        scanner.useDelimiter(",");
        while (scanner.hasNext()) {
            songs.add(scanner.next());
        }
        scanner.close();
        return data;
    }
         */
}
