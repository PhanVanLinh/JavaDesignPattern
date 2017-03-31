package example.toong.myapplication;

/**
 * Created by phanvanlinh on 31/03/2017.
 * phanvanlinh.94vn@gmail.com
 */

public class MediaAdapter implements MediaPlayer {

    AdvanceMediaPlayer mAdvanceMediaPlayer;

    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("vlc")) {
            mAdvanceMediaPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")) {
            mAdvanceMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")) {
            mAdvanceMediaPlayer.playVlc(fileName);
        } else if (audioType.equalsIgnoreCase("mp4")) {
            mAdvanceMediaPlayer.playMp4(fileName);
        }
    }
}
