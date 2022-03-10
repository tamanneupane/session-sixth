package training.day12;

public class ArrayPractice {

    public static void main(String[] args) {
//        int a = 2;

//        int[] a = new int[100];
//
//        a[0] = 2;
//
//        a[99] = 1000;
//
//        int someDataFromArray = a[5];
//
////        System.out.println(someDataFromArray);
//
//        for (int index= 0; index < 100; index++){
//            System.out.println(a[index]);
//        }


        String[] strings = new String[10];

        strings[3] = "Taman";

        for (int index= 0; index < 10; index++){
            if(index == 3) {
                System.out.println(strings[index]);
                break;
            }else{
                System.out.println("Not interested");
            }
        }

    }
}
