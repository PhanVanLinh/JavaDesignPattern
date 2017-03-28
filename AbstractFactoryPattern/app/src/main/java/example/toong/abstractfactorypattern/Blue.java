package example.toong.abstractfactorypattern;

import android.util.Log;
import example.toong.abstractfactorypattern.utils.Constant;

/**
 * Created by phanvanlinh on 28/03/2017.
 * phanvanlinh.94vn@gmail.com
 */

public class Blue implements Color {
    @Override
    public void fill() {
        Log.i(Constant.TAG,"Inside Blue::fill() method.");
    }
}
