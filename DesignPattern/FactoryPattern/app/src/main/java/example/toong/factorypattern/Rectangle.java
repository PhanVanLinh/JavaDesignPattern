package example.toong.factorypattern;

import android.util.Log;
import example.toong.factorypattern.utils.Constant;

/**
 * Created by phanvanlinh on 28/03/2017.
 * phanvanlinh.94vn@gmail.com
 */

public class Rectangle implements Shape {
    @Override
    public void draw() {
        Log.i(Constant.TAG, "Inside Rectangle::draw() method.");
    }
}
