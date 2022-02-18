package training.day5;

import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StringClassPractice {

    public static void main(String[] args) {

        Logger.getGlobal().setLevel(Level.OFF);
//        String name = "ABC";
//
//
//        Logger.getGlobal().info(name.toLowerCase());
//        Logger.getGlobal().info("ABC".toLowerCase());
//
//        String name1 = "ABC";
//
//        Logger.getGlobal().info(String.valueOf(name.hashCode()));
//        Logger.getGlobal().info(String.valueOf("ABCD".hashCode()));
//
//        Logger.getGlobal().info(String.valueOf(name1 == name));

        String greetings =  "Hello";
        String subString = greetings.substring(1);
        Logger.getGlobal().info(subString);

        String subString1 = greetings.substring(0, 3);
        Logger.getGlobal().info(subString1);

        Logger.getGlobal().info(String.valueOf(greetings.length()));

        int compareOutput = "a".compareTo("A");
        Logger.getGlobal().info(String.valueOf(compareOutput));

        int compareOutputIgnoreCasing = "a".compareToIgnoreCase("A");
        Logger.getGlobal().info(String.valueOf(compareOutputIgnoreCasing));

        String greet = "hello".toUpperCase();
        Logger.getGlobal().info(String.valueOf(greet));

        String concatinatedString = "Hello ".concat("Java Students") ;
        Logger.getGlobal().info(String.valueOf(concatinatedString));

        boolean stringContains = concatinatedString.contains("java");
        Logger.getGlobal().info(String.valueOf(stringContains));


        String formattedString = String.format("Dear %s , Welcome to our platform. Please enjoy your timein our application.", "Taman Neupane");
        Logger.getGlobal().info(String.valueOf(formattedString));

        String empty = " ";
        Logger.getGlobal().info(String.valueOf(empty.trim().length()));
        Logger.getGlobal().info(String.valueOf(empty.isBlank()));
        Logger.getGlobal().info(String.valueOf(empty.trim().isEmpty()));


        String splitPractice =  "Hello Java Students";
        String[] splitedString = splitPractice.split(" ");
        Logger.getGlobal().info(String.valueOf(splitedString.length));

        for (String splitted:splitedString) {
            System.out.println(splitted);
        }

    }
}
