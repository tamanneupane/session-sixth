package training.day18;

import training.day5.Gender;

import java.util.ArrayList;
import java.util.List;

public class MoreAboutArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> integerArrayList = new ArrayList<>();

        integerArrayList.add(5);
        integerArrayList.add(2);
        integerArrayList.add(1);
        integerArrayList.add(7);
        integerArrayList.add(4);

        List<Integer> subList = integerArrayList.subList(0, 3);

        System.out.println(subList);

//        System.out.println("########### Before Removal ###################");
//
//        System.out.println(integerArrayList);
//
//        integerArrayList.remove(new Integer(7));
//
        System.out.println("########### Before Adding ###################");

        System.out.println(integerArrayList);

        integerArrayList.add(2, 3);

        System.out.println("########### After Adding ###################");

        System.out.println(integerArrayList);

        integerArrayList.set(4, 6);

        System.out.println("########### After Updating ###################");

        System.out.println(integerArrayList);

        ArrayList<Employee> employees = new ArrayList<>(500);

        Employee employee1 =  new Employee("ABC", 2000f, "9851184633", Gender.MALE);
        Employee employee2 =  new Employee("ABCD", 20000f, "9851184611", Gender.FEMALE);
        Employee employee3 =  new Employee("ABCE", 3000f, "9851184622", Gender.MALE);

        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);

        System.out.println("########### Before Removal ###################");

        System.out.println(employees);

        boolean isDeleted = employees.remove(new Employee("ABCE", 3000f, "9851184622", Gender.MALE));

        System.out.println(isDeleted);
        //        employees.remove(employee3);

        System.out.println("########### After Removal ###################");

        System.out.println(employees);

        Employee employee = employees.get(0);

        System.out.println(employee);

        ArrayList<Employee> employeeCopyArrayList = new ArrayList<>(employees);

        System.out.println("########### After Adding All previous list ###################");

        System.out.println(employeeCopyArrayList);

        boolean isPresent = employees.contains(new Employee("ABC", 2000f, "9851184633", Gender.MALE));

        System.out.println(isPresent);
    }
}
