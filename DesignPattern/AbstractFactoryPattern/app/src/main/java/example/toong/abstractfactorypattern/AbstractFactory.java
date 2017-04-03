package example.toong.abstractfactorypattern;

/**
 * Created by phanvanlinh on 28/03/2017.
 * phanvanlinh.94vn@gmail.com
 */

public abstract class AbstractFactory {
    abstract Color getColor(String color);

    abstract Shape getShape(String shape);
}
