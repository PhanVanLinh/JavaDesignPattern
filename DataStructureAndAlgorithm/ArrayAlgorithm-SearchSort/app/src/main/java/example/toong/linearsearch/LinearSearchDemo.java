package example.toong.linearsearch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import example.toong.linearsearch.utils.MLog;

public class LinearSearchDemo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_search_demo);

        int i, srch = 72;
        int[] x = { 20, 15, 12, 30, -5, 72, 456 };

        for (i = 0; i < x.length; i++) {
            if (x[i] == srch) {
                MLog.d("Fount " + srch);
                return;
            }
        }
        MLog.d("can not found " + srch);
    }
}
