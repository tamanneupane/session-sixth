package training.day19;

public class VariableNumberOfParameters {

    public static void main(String[] args) {

        String mydDetails = String.format("My name is %s. My age is %d", "Taman Neupane", 30);
        System.out.println(mydDetails);

        add(2, 3);
        add(2,3,5);
    }

//    public static void add(int a, int b){
//        int c = a + b;
//        System.out.println(c);
//    }
//
//    public static void add(int a, int b, int c){
//        int temp = a + b + c;
//        System.out.println(temp);
//    }

    public static void add(int... numbers){
        int temp = 0;
        for (int number : numbers) {
            temp += number;
            System.out.print(number);
            System.out.print(",");
        }
        System.out.println("");
        System.out.println(temp);
    }
}
