package training.day12;

import java.math.BigInteger;
import java.util.logging.Logger;

public class LargeNumbersPractice {

    public static void main(String[] args) {

        long anyNumber = 1924556645;
        anyNumber = anyNumber + 1;

        BigInteger anyLargeNumber = new BigInteger("2556565654545454645645645465");
        BigInteger addedLargeNumber = anyLargeNumber.add(BigInteger.ONE);

        Logger.getGlobal().info(String.valueOf(addedLargeNumber));
    }
}
