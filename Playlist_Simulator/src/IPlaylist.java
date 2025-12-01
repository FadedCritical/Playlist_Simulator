public interface IPlaylist {
    void addSong(Song song);
    void removeSong(Song song);
    Song getSong(int index);
    int getTotalDuration();
    void shuffle();
    void savePlaylist(String filePath);
}
