package training.day8;

import java.util.Scanner;

public class ReadingFromCommandLine {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter your name : ");
        String name = in.nextLine();

        System.out.println("Please enter your age : ");
        int age = in.nextInt();

        System.out.println(name + " age is " + age);
    }
}
