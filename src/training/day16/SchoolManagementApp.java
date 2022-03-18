package training.day16;

import java.util.logging.Logger;

public class SchoolManagementApp {

    public static void main(String[] args) {
//        Person person = new Person("ABC", "30");
//        person.printDescription();

        Student student = new Student("ABC", "30", 1);
        Student student1 = new Student("ABasdasdC", "300", 1);

//        System.out.println(student);
//        System.out.println(student1);

        Logger.getGlobal().info(String.valueOf(student));


        System.out.println(student.equals(student1));

//        student.printDescription();

//        Teacher teacher = new Teacher("ABC", "30");
//        System.out.println(teacher.toString());
////        teacher.printDescription();
//
//        Staff staff = new Staff("ABC", "30");
//        System.out.println(staff.toString());
////        staff.printDescription();
    }
}
