package training.day1;

public class CatPractice {

    public static void main(String[] args) {

        int a = 5;

        Cat thor = new Cat();
//        thor.name = "Thor";
        thor.setName("Thor");
//        thor.age = 2;
        thor.setAge(2);
//        thor.color = "white";
        thor.setColor("white");
//        thor.weight = 2.5f;
        thor.setWeight(2.5f);

        Cat rambo = new Cat();
//        rambo.name = "Rambo";
        rambo.setName("Rambo");
//        rambo.age = 3;
        rambo.setAge(3);
//        rambo.color = "Black";
        rambo.setColor("Black");
//        rambo.weight = 3.0f;
        rambo.setWeight(3.0f);

//        String thorName = thor.name;
        String thorName = thor.getName();
        System.out.println(thorName);
//        int thorAge = thor.age;
        int thorAge = thor.getAge();
        System.out.println(thorAge);

//        String ramboColor = rambo.color;
        String ramboColor = rambo.getColor();
        System.out.println(ramboColor);

//        String thorColor = thor.color;
        String thorColor = thor.getColor();
        System.out.println(thorColor);

//        thor.meow();

        thor.sleep();
        thor.eat();
        rambo.play();

    }
}
