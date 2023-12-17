package Interface;

public class MusicPlayer implements Playable, Playlistable{

    @Override
    public void play() {
        System.out.println("Playing the track");
    }

    @Override
    public void pause() {
        System.out.println("Pausing the track");
    }

    @Override
    public void stop() {
        System.out.println("Stopping the track");
    }

    @Override
    public void createPlaylist(String playlistName) {
        System.out.println("Creating the Playlist: "+playlistName);
    }

    @Override
    public void addTrackToPlaylist(String playlistName, MusicTrack track) {
        System.out.println("Adding track "+track.getTitle()+ " to playlist: "+playlistName);
    }

    @Override
    public void removeTrackFromPlaylist(String playlistName, MusicTrack track) {
        System.out.println("Removing track "+track+ " from the playlist: "+playlistName);
    }
}
