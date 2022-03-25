package training.day21;

import java.io.IOException;

public class AgeRestrictionException extends IOException {

    public AgeRestrictionException(){
        super();
    }

    public AgeRestrictionException(String message){
        super(message);
    }
}
