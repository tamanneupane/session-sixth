package training.day9;

import java.io.Console;

public class ReadingPasswordFromCommandLine {

    public static void main(String[] args) {
        Console cons = System.console();

        ReadingPasswordFromCommandLine readingPasswordFromCommandLine = new ReadingPasswordFromCommandLine();
        readingPasswordFromCommandLine.askForUserCredentials(cons);

        System.out.println("After function call");

        readingPasswordFromCommandLine.askForUserCredentials(cons);

    }

    public void  askForUserCredentials(Console console){
        System.out.println("method getting called");

        String email = console.readLine("Email : ");
        char[] password = console.readPassword("Password : ");

        System.out.println(email);

        for (char p :password) {
            System.out.print(p);
        }
    }
}
