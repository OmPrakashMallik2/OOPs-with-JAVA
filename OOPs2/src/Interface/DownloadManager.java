package Interface;

public class DownloadManager implements Downloadable{
    @Override
    public void download(MusicTrack track) {
        System.out.println("Downloading the track: "+track.getTitle());
    }

    @Override
    public boolean isDownloaded(MusicTrack track) {
        return false;
    }
}
