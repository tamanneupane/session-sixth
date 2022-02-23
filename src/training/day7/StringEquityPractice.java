package training.day7;

import java.util.Locale;

public class StringEquityPractice {

    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = "Hell";

        String s3 = s1.substring(0,4).toUpperCase();

        System.out.println("s2 = "+ s2);
        System.out.println("s3 = "+ s3);

        System.out.println(s2.equals(s3));
        System.out.println(s2.equalsIgnoreCase(s3));


        String concatinated = "Hello " + "world " + "I " + "Am " + "Learning " + "about " + "java";

        System.out.println(concatinated);

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hello ");
        stringBuilder.append("world ");
        stringBuilder.append("I ");
        stringBuilder.append("Am ");
        stringBuilder.append("Learning ");
        stringBuilder.append("about ");
        stringBuilder.append("java");

        String concatinatedUsingBuilder = stringBuilder.toString();
        System.out.println(concatinatedUsingBuilder);
    }
}
