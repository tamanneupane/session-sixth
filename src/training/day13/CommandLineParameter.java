package training.day13;

public class CommandLineParameter {

    public static void main(String[] args) {

        System.out.println(args.length);

        for (String arg : args) {
            System.out.println(arg);
        }
    }
}
