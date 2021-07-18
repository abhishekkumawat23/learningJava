import dataStructures.Breathable;

public class Human extends Animal implements Breathable, Runnable, Eatable, Swimmable {
    
    public static void main(String[] args) {
        // Human human = new Human();
        // Animal human = new Human();
        // Object human = new Human();
        // Breathable human = new Human();
        // Runnable human = new Human();
        Walkable human = new Human();
    }
}
