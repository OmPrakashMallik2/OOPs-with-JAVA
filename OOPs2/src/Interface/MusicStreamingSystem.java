package Interface;

public class MusicStreamingSystem {
    public static void main(String[] args) {

        MusicPlayer musicPlayer = new MusicPlayer();
        DownloadManager downloadManager = new DownloadManager();
        MusicTrack track1 = new MusicTrack("STAR BOY", "THE WEEKEND", 3.47);
        MusicTrack track2 = new MusicTrack("POP STAR", "DRAKE", 4.04);

        musicPlayer.play();
        musicPlayer.createPlaylist("PLAYLIST1");
        musicPlayer.addTrackToPlaylist("PLAYLIST1", track1);

        DownloadManager downloadManager1 = new DownloadManager();
        downloadManager1.download(track2);
    }
}


