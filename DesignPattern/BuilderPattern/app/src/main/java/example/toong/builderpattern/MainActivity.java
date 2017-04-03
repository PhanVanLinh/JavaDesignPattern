package example.toong.builderpattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import example.toong.builderpattern.utils.MLog;

/**
 * https://www.tutorialspoint.com/design_pattern/builder_pattern.htm
 *
 * Builder pattern builds a complex object using simple objects and using a step by step approach.
 * This type of design pattern comes under creational pattern as this pattern provides one of the
 * best ways to create an object.
 *
 * Khi mở rộng (thêm 1 loại item vào) có vẻ sẽ dễ dàng hơn rất nhiều
 *
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        MLog.i("Veg Meal");
        vegMeal.showItems();
        MLog.i("Total Cost: " + vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        MLog.i("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        MLog.i("Total Cost: " + nonVegMeal.getCost());
    }
}
