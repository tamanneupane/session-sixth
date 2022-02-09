package training.day1;

public class BankPractice {

    public static void main(String[] args) {

        int a = 5;
        int b = 2;

        int c = addTwoNumbers(b,a);
        System.out.println(c);

        int d = 5;
        int e = 5;

        int f = addTwoNumbers(e, d);
        System.out.println(f);

        int g = 5;
        int h = 10;

        int i = addTwoNumbers(g,h);
        System.out.println(i);
    }

    public static int addTwoNumbers(int a, int b)
    {
        int temp = a * b;
        return temp;
    }
}
