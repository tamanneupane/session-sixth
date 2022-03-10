package training.day8;

import java.util.Scanner;
import java.util.logging.Logger;

public class ReadingFromCommandLine {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter your name : ");
        String name = in.nextLine();

        System.out.println("Please enter your class : ");
        int studentClass = in.nextInt();

        System.out.println("Please enter your marks for science : ");
        float scienceMark = in.nextFloat();

        System.out.println("Please enter your marks for Maths : ");
        float mathsMark = in.nextFloat();

        System.out.println("Please enter your marks for English : ");
        float englishMark = in.nextFloat();

        System.out.println("Please enter your marks for social : ");
        float socialMark = in.nextFloat();

        Logger.getGlobal().info(String.valueOf("Name = " + name ));
        Logger.getGlobal().info(String.valueOf("Class = " + studentClass ));
        Logger.getGlobal().info(String.valueOf("Science = " + scienceMark ));
        Logger.getGlobal().info(String.valueOf("Maths = " + mathsMark ));
        Logger.getGlobal().info(String.valueOf("English = " + englishMark ));
        Logger.getGlobal().info(String.valueOf("social = " + socialMark ));

        float totalMarksObtained = (scienceMark + mathsMark + englishMark + socialMark);
        float percentage = (totalMarksObtained/400) * 100;

        Logger.getGlobal().info(String.format("%s percentage is %5.2f", name , percentage ));

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
    }
}
