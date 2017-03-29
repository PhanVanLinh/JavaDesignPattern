package example.toong.singletonpattern.utils;

import android.util.Log;

/**
 * Created by phanvanlinh on 29/03/2017.
 * phanvanlinh.94vn@gmail.com
 */

public class MLog {
    public static void i(String message) {
        Log.i(Constant.TAG, message);
    }

    public static void d(String message) {
        Log.d(Constant.TAG, message);
    }

    public static void v(String message) {
        Log.v(Constant.TAG, message);
    }

    public static void w(String message) {
        Log.w(Constant.TAG, message);
    }

    public static void e(String message) {
        Log.e(Constant.TAG, message);
    }
}
