package example.toong.prototypepattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import example.toong.prototypepattern.utils.MLog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ShapeCache.loadCache();

        Shape cloneShape = ShapeCache.getShape("1");
        MLog.i("Shape : "+cloneShape.getType());

        Shape cloneShape2 = ShapeCache.getShape("2");
        MLog.i("Shape: "+cloneShape2.getType());


        Shape cloneShape3 = ShapeCache.getShape("3");
        MLog.i("Shape: "+cloneShape3.getType());

    }
}
