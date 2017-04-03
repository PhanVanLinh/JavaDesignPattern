package example.toong.builderpattern;

/**
 * Created by phanvanlinh on 29/03/2017.
 * phanvanlinh.94vn@gmail.com
 */

public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 50;
    }
}
