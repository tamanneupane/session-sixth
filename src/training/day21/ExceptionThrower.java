package training.day21;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionThrower {

    public void downloadImage() throws FileNotFoundException {
        //Some code to download the image
    }

    public void getDataFromAnArray(int position) throws ArrayIndexOutOfBoundsException{
        //  Some code to get the data from an array of the specific position
        int[] numbers = {2,8,4,6};
        int temp = numbers[position];
        System.out.println(temp);
    }

    public void checkAge(int age) throws AgeRestrictionException, IndexOutOfBoundsException{
        if(age < 18){
            throw new AgeRestrictionException("Your age is less than 18. So  you are not allowed to create the account in this application");
        }else{
            // Normally do what you want
//            throw new IndexOutOfBoundsException("Some error message");
        }
    }
}
