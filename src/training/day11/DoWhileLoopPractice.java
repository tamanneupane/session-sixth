package training.day11;

import java.util.logging.Logger;

public class DoWhileLoopPractice {

    public static void main(String[] args) {

        int i = 1001;

        do {
            Logger.getGlobal().info(String.valueOf(i));
            i++;
        }while (i <= 1000);

    }
}
