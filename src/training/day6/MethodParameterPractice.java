package training.day6;

public class MethodParameterPractice {

    public static void main(String[] args) {
        int a  = 10;
       MethodParameterPractice methodParameterPractice = new MethodParameterPractice();
       methodParameterPractice.printNumber(10);
       System.out.println(a);
    }

    public void printNumber(int a){
//        System.out.println(a);
        a = 15;
    }
}
