package training.day8;

public class ExplicitTypeConversionPractice {

    public static void main(String[] args) {
        double d = 27.688228238134464;
        float f = (float) d;// explicit type casting required
        long l = (long) f; // explicit type casting required
        int i = (int) l; // explicit type casting required
        short s = (short) i;// explicit type casting required
        byte b = (byte) s;// explicit type casting required

        System.out.println("Double value is: " + d);
        System.out.println("Float value is: " + f);
        System.out.println("Long value is: " + l);
        System.out.println("Int value is: " + i);
        System.out.println("Short value is: " + s);
        System.out.println("Byte value is: " + b);

        byte bb =  (byte) 130;
        System.out.println(bb);
        byte by = (byte)d;

        int in =  (int) (i + f);

//		boolean x = true;
//		int y = (int) x;

        double d2 = 97.0;
        char ch2 = (char) d2;
        System.out.println(ch2);
    }
}
