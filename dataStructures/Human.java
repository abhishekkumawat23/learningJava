package dataStructures;

public class Human extends Animal implements Breathable {

    private String name;
    private String color;
    private int age;

    public Human(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    @Override
    public void breathe(String gas) {
        System.out.println("I am breahting " + gas + "gas");
    }

    @Override
    public void khasna() {

    }

    @Override
    public boolean equals(Object obj) {
        Human otherObject = (Human) obj;
        return this.name.equals(otherObject.name) && 
        this.age == otherObject.age &&
        this.color.equals(otherObject.color);
    }

    public void eat() {

    }
}
