package training.day21;

import javax.swing.*;
import java.io.IOException;

public class ExceptionPractice {

    public static void main(String[] args) {

        ExceptionThrower exceptionThrower = new ExceptionThrower();

//        exceptionThrower.downloadImage();


        try {
            exceptionThrower.checkAge(25);
        } catch (AgeRestrictionException | IndexOutOfBoundsException exception) {
            exception.printStackTrace();
            //Save all the work of the user

//            JOptionPane.showMessageDialog(null, exception.getMessage());
//            System.exit(0);
        }finally {
            System.out.println("Finally Getting Executed");
        }


        exceptionThrower.getDataFromAnArray(0);


    }
}
