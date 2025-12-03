public interface IPlaylist {
    void addSong(Song song);
    void removeSong(String songName);
    Song getSong(int index);
    int getTotalDuration();
    void shuffle();
    void savePlaylist(String filePath);
}
