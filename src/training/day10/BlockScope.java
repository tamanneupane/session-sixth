package training.day10;

import java.util.logging.Logger;

public class BlockScope {

     int i = 2;

    public static void main(String[] args)
    {

        int j = 5;

        {
//            Logger.getGlobal().info(String.valueOf(k));
            int k = 5;
            Logger.getGlobal().info(String.valueOf(k));
            Logger.getGlobal().info(String.valueOf(j));
        }

//        Logger.getGlobal().info(String.valueOf(k));

    }

    public void someOtherMethod()
    {
        Logger.getGlobal().info(String.valueOf(i));

//        Logger.getGlobal().info(String.valueOf(j));
    }
}
