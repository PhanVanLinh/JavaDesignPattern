package example.toong.builderpattern;

/**
 * Created by phanvanlinh on 29/03/2017.
 * phanvanlinh.94vn@gmail.com
 */

public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
