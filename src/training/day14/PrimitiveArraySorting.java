package training.day14;

import training.day13.Employee;
import training.day5.Gender;

import java.util.Arrays;

public class PrimitiveArraySorting {

    public static void main(String[] args) {

//        int[] numbers = {2,1,9,5,3};
//
//         Arrays.sort(numbers, 1,5);
//
//        for (int num : numbers) {
//            System.out.print(num + " ");
//        }

        String[] names = {"A", "D", "C", "B"};

//        Arrays.sort(names);

//        for (String name : names) {
//            System.out.print(name + " ");
//        }

        String[] reverseName = new String[names.length];

        for (int index = 1; index <= names.length ; index++) {
            System.out.println(names.length - index);
            reverseName[index-1] = names[names.length - index];
        }

        for (String name : reverseName) {
            System.out.print(name + " ");
        }



//        Employee[] employees = new Employee[3];
//
//        employees[0] = new Employee("ABC", 2000, "9851184633", Gender.MALE);
//        employees[1] = new Employee("DEF", 1000, "9851184622", Gender.FEMALE);
//        employees[2] = new Employee("IJK", 5000, "9851184622", Gender.MALE);
//
//        Arrays.sort(employees);
//
//        for (Employee emp : employees) {
//            System.out.print(emp);
//        }

    }
}
