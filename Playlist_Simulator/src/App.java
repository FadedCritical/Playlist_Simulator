

public class App {
    public static void main(String[] args) throws Exception {
        PlaylistManager playlistManager = new PlaylistManager();

        System.out.println("Initial Playlist:");
        for (int i = 0; i < playlistManager.getSize(); i++) {
            playlistManager.getSong(i).forEach(song -> System.out.println(song));
        }

        System.out.println("Shuffled Playlist:");
        playlistManager.shuffle();
        for (int i = 0; i < playlistManager.getSize(); i++) {
            playlistManager.getSong(i).forEach(song -> System.out.println(song));
        }

        System.out.println("Removing 'BabyShark' from Playlist:");
        playlistManager.removeSong("BabyShark");
        for (int i = 0; i < playlistManager.getSize(); i++) {
            playlistManager.getSong(i).forEach(song -> System.out.println(song));
        }

        System.out.println("Adding 'BabyShark' back to Playlist:");
        playlistManager.addSong(new Song ("BabyShark", 120, "Pinkfong", "Kids"));
        for (int i = 0; i < playlistManager.getSize(); i++) {
            playlistManager.getSong(i).forEach(song -> System.out.println(song));
        }
        
        System.out.println("Total Duration: " + playlistManager.getTotalDuration() + " seconds");
    }
}
