package Interface;

public interface Playlistable {
    void createPlaylist(String playlistName);
    void addTrackToPlaylist(String playlistName, MusicTrack track);
    void removeTrackFromPlaylist(String playlistName, MusicTrack track);
}
