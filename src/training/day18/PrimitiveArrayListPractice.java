package training.day18;

import java.util.ArrayList;
import java.util.logging.Logger;

public class PrimitiveArrayListPractice {

    public static void main(String[] args) {

//        ArrayList<IntegerWrapper> ints = new ArrayList<IntegerWrapper>();
//        ints.add(new IntegerWrapper(2));

        ArrayList<Integer> ints1 = new ArrayList<Integer>();
        ints1.add(2);
        ints1.add(3);
        ints1.add(5);
        ints1.add(6);
        ints1.add(10);

        int integer = ints1.get(2);

        Logger.getGlobal().info(String.valueOf(integer));
    }

}
