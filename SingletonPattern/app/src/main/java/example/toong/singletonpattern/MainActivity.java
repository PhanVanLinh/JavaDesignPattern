package example.toong.singletonpattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //illegal construct
        //Compile Time Error: The constructor SingleObjec() is not visible
        // SingleObject object = new SingleObject();

        // Get the only object available
        SingleObject object = SingleObject.getInstance();

        // show message
        object.showMessage();
    }
}
