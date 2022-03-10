package training.day11;

import java.util.logging.Logger;

public class SwitchStatementPractice {

    public static void main(String[] args) {
        String today = "thursday";

        // Enhanced Switch
        switch (today.toLowerCase()) {
            case "sunday", "saturday" -> Logger.getGlobal().info("Holiday");
            case "monday" -> Logger.getGlobal().info("Monday");
            case "tuesday" -> Logger.getGlobal().info("Tuesday");
            case "wednesday" -> Logger.getGlobal().info("Wednesday");
            case "thursday" -> Logger.getGlobal().info("Thursday");
            case "friday" -> Logger.getGlobal().info("Friday");
            default -> Logger.getGlobal().info("Error");
        }

        // older switch
//        switch (today.toLowerCase()){
//            case "sunday" :
//                Logger.getGlobal().info("sunday");
//                break;
//            case "monday" :
//                Logger.getGlobal().info("monday");
//                break;
//            case "tuesday" :
//                Logger.getGlobal().info("tuesday");
//                break;
//            case "wednesday" :
//                Logger.getGlobal().info("wednesday");
//                break;
//            case "thursday" :
//                Logger.getGlobal().info("thursday");
//                break;
//            case "friday" :
//                Logger.getGlobal().info("friday");
//                break;
//            case "saturday" :
//                Logger.getGlobal().info("saturday");
//                break;
//            default:
//                Logger.getGlobal().info("Error");
//                break;
//        }
    }
}
