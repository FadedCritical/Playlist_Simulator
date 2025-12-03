public class App {
    public static void main(String[] args) throws Exception {
        PlaylistManager playlistManager = new PlaylistManager();

        // Gets the first 5 songs and prints their details
        for (int i = 0; i < 5; i++) {
            playlistManager.getSong(i).forEach(song -> System.out.println(song));
        }

        // Gets the first 5 songs and prints their details after shuffling
        playlistManager.shuffle();
        for (int i = 0; i < 5; i++) {
            playlistManager.getSong(i).forEach(song -> System.out.println(song));
        }
        playlistManager.removeSong("MidnightEcho");

        playlistManager.addSong(new Song ("BabyShark", 120, "Pinkfong", "Kids"));
    }
}
