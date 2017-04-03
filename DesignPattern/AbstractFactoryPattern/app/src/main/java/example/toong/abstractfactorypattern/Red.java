package example.toong.abstractfactorypattern;

import android.util.Log;
import example.toong.abstractfactorypattern.utils.Constant;

public class Red implements Color {

   @Override
   public void fill() {
      Log.i(Constant.TAG, "Inside Red::fill() method.");
   }
}