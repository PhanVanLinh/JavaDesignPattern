package example.toong.builderpattern;

import example.toong.builderpattern.utils.MLog;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by phanvanlinh on 29/03/2017.
 * phanvanlinh.94vn@gmail.com
 */

public class Meal {
    private List<Item> mItemList = new ArrayList<>();

    public void addItem(Item item) {
        mItemList.add(item);
    }

    public float getCost() {
        float cost = 0.0f;

        for (Item item : mItemList) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems() {
        for (Item item : mItemList) {
            MLog.i("Item : " + item.name());
            MLog.i(", Packing : " + item.packing().pack());
            MLog.i(", Price : " + item.price());
        }
    }
}
