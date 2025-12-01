public class App {
    public static void main(String[] args) throws Exception {
        PlaylistManager playlistManager = new PlaylistManager();

        //gets the first 5 songs and prints their details
        for (int i = 0; i < 5; i++) {
            playlistManager.getSong(i).forEach(song -> System.out.println(song));
        }
    }
}
