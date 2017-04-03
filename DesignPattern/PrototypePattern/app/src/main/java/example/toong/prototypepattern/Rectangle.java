package example.toong.prototypepattern;

import example.toong.prototypepattern.utils.MLog;

/**
 * Created by phanvanlinh on 29/03/2017.
 * phanvanlinh.94vn@gmail.com
 */

public class Rectangle extends Shape {

    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    void draw() {
        MLog.i("Inside Rectangle::draw() method.");
    }
}
