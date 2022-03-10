package training.day9;

public class FormattingOutput {

    public static void main(String[] args) {
        double x = 10000.0 / 3.0;
        System.out.println(x);

        System.out.printf("The result of division is %5.2f", x);
    }
}
