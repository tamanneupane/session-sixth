package training.day2;

import java.util.ArrayList;

public class PolymorphismPractice {

    public static void main(String[] args) {

        add(2,3, 4);

        Student student = new Student();
        Teacher teacher = new Teacher();
        Staff staff = new Staff();

        ArrayList<Person> arrayList = new ArrayList<>();
        arrayList.add(teacher);
        arrayList.add(student);
        arrayList.add(staff);
    }

    public static void add(int a, int b){
        int temp = a + b;
        System.out.println(temp);
    }

    public static void add(int a, int b, int c){
        int temp = a + b + c;
        System.out.println(temp);
    }

    public static void add(int a, int b, int c, int d){
        int temp = a + b + c + d;
        System.out.println(temp);
    }
}
