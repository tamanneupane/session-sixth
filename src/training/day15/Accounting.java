package training.day15;

import java.time.LocalDate;
import java.util.logging.Logger;

public class Accounting {

    public static void main(String[] args) {

        Manager boss = new Manager("ABC", 50, LocalDate.now(), 5000, 200);


        Employee employee1 = new Employee("DEF", 28, LocalDate.now(), 2000);

//        Logger.getGlobal().info(String.valueOf(boss.getSalary()));
//        Logger.getGlobal().info(String.valueOf(employee1.getSalary()));

        //Polymorphism (Compile Time)
        Accounting accounting = new Accounting();
        accounting.add(2,3);
        accounting.add(2,3, 4);

        //Polymorphism (Runtime)
        Employee boss2 = new Manager("IJK", 60, LocalDate.now(), 75000, 500);
//        boss2.getBonus();

        if(boss2 instanceof Manager){
            ((Manager)boss2).getBonus();
        }

//        Logger.getGlobal().info(String.valueOf(boss2.getSalary()));


//        accounting.printSalary(employee1);
//        accounting.printSalary(boss);
    }

    public void add(int a, int b){}

    public void add(int a, int b, int c){}


//    public void printSalary(Manager manager){
//        Logger.getGlobal().info(String.valueOf(manager.getSalary()));
//    }

    public void printSalary(Employee employee){
        Logger.getGlobal().info(String.valueOf(employee.getSalary()));

    }
}
