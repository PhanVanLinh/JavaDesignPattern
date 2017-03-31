package example.toong.myapplication;

import example.toong.myapplication.utils.MLog;

/**
 * Created by phanvanlinh on 31/03/2017.
 * phanvanlinh.94vn@gmail.com
 */

public class VlcPlayer implements AdvanceMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        MLog.d("Play vlc file. Name "+fileName);
    }

    @Override
    public void playMp4(String fileName) {
        // do nothing
    }
}
