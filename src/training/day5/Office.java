package training.day5;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Office {

    public static void main(String[] args) {

        Logger.getGlobal().setLevel(Level.OFF);
//        Employee employee = new Employee();
//
//        Logger.getGlobal().info(employee.toString());
//
//        employee.setName("ABC");
//        employee.setSalary(5000);
//        employee.setPhoneNumber("123456789");
//
//        Logger.getGlobal().info(employee.toString());


        Employee employee1 = new Employee("ABC", 2000, "123456789", Gender.MALE);
        Employee employee2 = new Employee("ABCD", 5000, "1234567890", Gender.MALE);
        Employee employee3 = new Employee("ABC", 2000, "123456789", Gender.FEMALE, "258639741");

        employee1.addBonus(500);
        System.out.println(employee1);

        if(employee1.getGender() == Gender.MALE){
            System.out.println(String.format("Yes the gender of %s is %s", employee1.getName(), Gender.MALE.name()));
        }

//        String name = takeNameFromUI();
//        String phoneNumber = takePhoneNumberFromUI();
//
//        Employee employee3 = new Employee(name, 0, phoneNumber);
//        if(employee3.getName().isBlank()){
//            System.out.println("The name you have entered is empty. Please enter the name again");
//        }
    }

    public static String takeNameFromUI(){
        return  null;
    }

    public static String takePhoneNumberFromUI(){
        return  null;
    }
}
