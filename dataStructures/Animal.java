package dataStructures;

public class Animal implements Breathable {

    public Animal() {}

    @Override
    public void breathe() {
        System.out.println("Animal is breathing");
    }
}
