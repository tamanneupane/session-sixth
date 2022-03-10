package training.day10;

import java.util.logging.Logger;

public class IfStatementPractice {

    public static void main(String[] args) {
        float percentage = 75;

        if(percentage >= 80) {
            Logger.getGlobal().info("Congratulations you have passed with Distinction");
        }
        else if(percentage >60)
        {
            Logger.getGlobal().info("Congratulations you have passed with first division");
        }
        else if(percentage > 50)
        {
            Logger.getGlobal().info("Congratulations you have passed with second division");
        }
        else if(percentage > 40 )
        {
            Logger.getGlobal().info("Congratulations you have passed with third division");
        }
        else
        {
            Logger.getGlobal().info("Sorry you have failed");
        }


//        Logger.getGlobal().info("After If");

    }
}
