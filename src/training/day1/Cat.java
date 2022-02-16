package training.day1;

public class Cat {

    //states
    //name
    private String name;
    //age
    private int age;
    //color
    private String color;
    //weight
    private float weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    //Behaviour
    // meow
    private void meow(){
        System.out.println("Meow");
    }
    // sleep
    void sleep(){
        System.out.println("sleep");
    }
    // eats
    void eat(){
        System.out.println("eat");
        meow();
    }
    // plays
    void play(){
        System.out.println("play");
        meow();
    }
}
