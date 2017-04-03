package example.toong.myapplication;

import example.toong.myapplication.utils.MLog;

/**
 * Created by phanvanlinh on 31/03/2017.
 * phanvanlinh.94vn@gmail.com
 */

public class Mp4Player implements AdvanceMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        // do nothing
    }

    @Override
    public void playMp4(String fileName) {
        MLog.d("Playing mp4 file. Name "+fileName);
    }
}
