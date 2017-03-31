package example.toong.prototypepattern;

import example.toong.prototypepattern.utils.MLog;

/**
 * Created by phanvanlinh on 29/03/2017.
 * phanvanlinh.94vn@gmail.com
 */

public class Square extends Shape {

    public Square(){
        type = "Square";
    }


    @Override
    void draw() {
       MLog.i("Inside Square::draw() method.");
    }
}
