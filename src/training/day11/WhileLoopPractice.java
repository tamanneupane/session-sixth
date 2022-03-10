package training.day11;

import java.util.logging.Logger;

public class WhileLoopPractice {

    public static void main(String[] args) {

//        Logger.getGlobal().info("1");
//        Logger.getGlobal().info("2");
//        Logger.getGlobal().info("3");
//        Logger.getGlobal().info("4");
//        Logger.getGlobal().info("5");
//
//        Logger.getGlobal().info("6");
//        Logger.getGlobal().info("7");
//        Logger.getGlobal().info("8");
//        Logger.getGlobal().info("9");
//        Logger.getGlobal().info("10");

        int i = 1001;

        while (i<=1000){
            Logger.getGlobal().info(String.valueOf(i));
            i++;
        }
    }
}
