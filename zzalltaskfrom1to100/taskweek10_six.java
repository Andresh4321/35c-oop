package zzalltaskfrom1to100;
interface Playlist {
    void addSong(String song);
    void removeSong(String song);
}

class MediaPlayer {
    public void play() {
        System.out.println("Playing media...");
    }

    public void pause() {
        System.out.println("Pausing media...");
    }

    public void stop() {
        System.out.println("Stopping media...");
    }
}

class VideoPlayer extends MediaPlayer implements Playlist {
    @Override
    public void addSong(String song) {
        System.out.println("Adding song to playlist: " + song);
    }

    @Override
    public void removeSong(String song) {
        System.out.println("Removing song from playlist: " + song);
    }

    public void rewind() {
        System.out.println("Rewinding video...");
    }

    public void fastForward() {
        System.out.println("Fast-forwarding video...");
    }
}

public class taskweek10_six {
    public static void main(String[] args) {
        VideoPlayer videoPlayer = new VideoPlayer();
        
        videoPlayer.play();
        videoPlayer.rewind();
        videoPlayer.addSong("Song 1");
        videoPlayer.fastForward();
        videoPlayer.pause();
        videoPlayer.stop();
        videoPlayer.removeSong("Song 1");
    }
}

