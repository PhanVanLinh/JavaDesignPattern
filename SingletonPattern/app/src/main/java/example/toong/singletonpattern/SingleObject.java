package example.toong.singletonpattern;

import example.toong.singletonpattern.utils.MLog;

/**
 * Created by phanvanlinh on 29/03/2017.
 * phanvanlinh.94vn@gmail.com
 */

public class SingleObject {

    private static SingleObject instance = new SingleObject();

    private SingleObject() {
    }

    public static SingleObject getInstance(){
        return instance;
    }

    public void showMessage(){
        MLog.i("Hellow World");
    }
}
