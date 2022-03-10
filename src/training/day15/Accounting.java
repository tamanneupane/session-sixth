package training.day15;

import java.time.LocalDate;
import java.util.logging.Logger;

public class Accounting {

    public static void main(String[] args) {

        Manager boss = new Manager("ABC", 50, LocalDate.now(), 5000, 200);

        Employee employee1 = new Employee("DEF", 28, LocalDate.now(), 2000);

        Logger.getGlobal().info(String.valueOf(boss.getSalary()));
        Logger.getGlobal().info(String.valueOf(employee1.getSalary()));
    }
}
