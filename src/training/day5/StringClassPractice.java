package training.day5;

import java.util.logging.Logger;

public class StringClassPractice {

    public static void main(String[] args) {
        String name = "ABC";

        Logger.getGlobal().info(name.toLowerCase());
        Logger.getGlobal().info("ABC".toLowerCase());

        String name1 = "ABC";

        Logger.getGlobal().info(String.valueOf(name.hashCode()));
        Logger.getGlobal().info(String.valueOf("ABCD".hashCode()));

        Logger.getGlobal().info(String.valueOf(name1 == name));
    }
}
