package example.toong.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * Cách viết này giúp khi mình muốn phần code play mp3, mp4, vlc sẽ khác nhau
 *
 * Adapter pattern works as a bridge between two incompatible interfaces
 *
 * https://www.tutorialspoint.com/design_pattern/adapter_pattern.htm
 *
 * We have a MediaPlayer interface and a concrete class AudioPlayer implementing the MediaPlayer
 * interface. AudioPlayer can play mp3 format audio files by default.
 *
 * We are having another interface AdvancedMediaPlayer and concrete classes implementing the
 * AdvancedMediaPlayer interface. These classes can play vlc and mp4 format files.
 *
 * We want to make AudioPlayer to play other formats as well. To attain this, we have created an
 * adapter class MediaAdapter which implements the MediaPlayer interface and uses
 * AdvancedMediaPlayer objects to play the required format.
 *
 * AudioPlayer uses the adapter class MediaAdapter passing it the desired audio type without knowing
 * the actual class which can play the desired format. AdapterPatternDemo, our demo class will use
 * AudioPlayer class to play various formats.
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }
}
