package training.day20;

public class OuterInnerClassTest {

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();

        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.show();

    }
}
