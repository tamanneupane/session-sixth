package training.day4;

public class PredefinedClassesPractice {

    public static void main(String[] args) {




//        Math math = new Math();
        System.out.println(Math.ceil(4.1));
        System.out.println(Math.floor(4.9));
        System.out.println(Math.round(4.51));

        System.out.println(Math.PI);

//        Math.PI = 2;
        System.out.println(Math.abs(-2));

        double randomNumber = Math.random();
        System.out.println(Math.round(randomNumber * 100));
    }
}
