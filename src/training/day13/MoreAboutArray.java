package training.day13;

import training.day5.Gender;

import java.util.Arrays;

public class MoreAboutArray {

    public static void main(String[] args) {
        Employee[] employees = new Employee[6];

        employees[3] = new Employee("Taman", 2000, "9851184633", Gender.MALE);

        System.out.println("**********Data before copying**********");

        long centerIndex = Math.round(Math.ceil((employees.length-1f)/2));

        System.out.println(centerIndex);

//        for(Employee employee : employees){
//            System.out.println(employee);
//        }

        Employee[] employeesCopy =  Arrays.copyOf(employees,employees.length);
//
//        employeesCopy[4] = new Employee("ABC", 5000, "9851184622", Gender.FEMALE);
//
//        System.out.println("*********Data after copying and make changes**********");
//
//        for(Employee employee : employees){
//            System.out.println(employee);
//        }
    }
}
