package training.day17;

import training.day5.Gender;

import java.util.ArrayList;

public class ArrayListPractice {

    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>(500);

//        Employee[] employeesArray = new Employee[500];

        employees.add(new Employee("ABC", 2000f, "9851184633", Gender.MALE));
        employees.add(new Employee("ABCD", 20000f, "9851184611", Gender.FEMALE));
        employees.add(new Employee("ABCE", 3000f, "9851184622", Gender.MALE));

        System.out.println(employees);

        System.out.println("###################### After Deleting #################################");

        employees.remove(1);

        System.out.println(employees);

    }
}
