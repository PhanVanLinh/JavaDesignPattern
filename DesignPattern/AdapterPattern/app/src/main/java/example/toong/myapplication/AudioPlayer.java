package example.toong.myapplication;

import example.toong.myapplication.utils.MLog;

/**
 * Created by phanvanlinh on 31/03/2017.
 * phanvanlinh.94vn@gmail.com
 */

public class AudioPlayer implements MediaPlayer {

    MediaAdapter mMediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        // inbuilt support to play mp3 music files
        if (audioType.equalsIgnoreCase("mp3")) {
            MLog.i("Playing mp3 file. Name " + fileName);
        } else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
            mMediaAdapter = new MediaAdapter(audioType);
            mMediaAdapter.play(audioType, fileName);
        } else {
            MLog.i("Invalid media. " + audioType + "format is not support");
        }

       
    }
}
