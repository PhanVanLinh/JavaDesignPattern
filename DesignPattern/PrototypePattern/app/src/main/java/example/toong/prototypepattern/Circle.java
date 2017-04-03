package example.toong.prototypepattern;

import example.toong.prototypepattern.utils.MLog;

/**
 * Created by phanvanlinh on 29/03/2017.
 * phanvanlinh.94vn@gmail.com
 */

public class Circle extends Shape{

    public Circle(){
        type = "Circle";
    }

    @Override
    void draw() {
        MLog.i("Inside Circle::draw() method.");
    }
}
