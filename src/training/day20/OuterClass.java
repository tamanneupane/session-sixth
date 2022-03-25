package training.day20;

public class OuterClass {

    public  class  InnerClass{

        public void show(){
            System.out.println("Inside Inner Class");
        }
    }

    public InnerClass createObjectOfInnerClass(){
        InnerClass innerClass = new InnerClass();
        return innerClass;
    }

}
