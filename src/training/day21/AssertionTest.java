package training.day21;

public class AssertionTest {

    public static void main(String[] args) {
        int x = -4;

//        if(x<0) throw new IllegalArgumentException("The value of x is less than 0");
        assert x>0 : "The value of x is less than 0";

        double y = Math.sqrt(x);

        System.out.println(y);
    }
}
