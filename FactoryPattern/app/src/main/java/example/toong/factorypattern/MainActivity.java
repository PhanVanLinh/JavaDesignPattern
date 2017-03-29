package example.toong.factorypattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import java.util.Locale;

/**
 * Demo from here: https://www.tutorialspoint.com/design_pattern/factory_pattern.htm
 *
 * Whole idea: In Factory pattern, we create object without exposing the creation logic to the
 * client and refer to newly created object using a common interface.
 *
 * Pros:
 * Hide concrete classes from client
 * The code deal with the interface
 * Advocate from the component based development
 *
 * Cons:
 * Singe
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Locale.getDefault().getLanguage();

        ShapeFactory shapeFactory = new ShapeFactory();

        //get an object of Circle and call its draw method.
        Shape shape1 = shapeFactory.getShape("CIRCLE");

        //call draw method of Circle
        shape1.draw();

        //get an object of Rectangle and call its draw method.
        Shape shape2 = shapeFactory.getShape("RECTANGLE");

        //call draw method of Rectangle
        shape2.draw();

        //get an object of Square and call its draw method.
        Shape shape3 = shapeFactory.getShape("SQUARE");

        //call draw method of circle
        shape3.draw();



    }
}
