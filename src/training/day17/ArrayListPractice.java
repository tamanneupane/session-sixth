package training.day17;

import training.day5.Gender;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListPractice {

    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>(500);

//        Employee[] employeesArray = new Employee[500];

        employees.add(new Employee("ABC", 2000f, "9851184633", Gender.MALE));
        employees.add(new Employee("ABCD", 1000f, "9851184611", Gender.FEMALE));
        employees.add(new Employee("ABCE", 3000f, "9851184622", Gender.MALE));

//        System.out.println(employees);
//
//        System.out.println("###################### After Deleting #################################");
//
//        employees.remove(1);
//
//        System.out.println(employees);


//        Collections.sort(employees);

        employees.sort((o1, o2) -> Float.compare(o2.getSalary(), o1.getSalary()));

        System.out.println(employees);

//        Comparable<Employee> employeeComparable = new Employee("ABC", 2000f, "9851184633", Gender.MALE);


    }
}
