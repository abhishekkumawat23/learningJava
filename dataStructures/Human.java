package dataStructures;

// In Java, you can extend only one class,
// but you can implement multiple interfaces.

// Interface is a group of common methods which a class can do.
// Example: Eatable: eat(), drink(), swallow(), spit(), vomit()
// Example: Walkable: walk(), run(), sprint()

// Class extension in javaa is like parent child relationshop.
// A extends B. A is child of B.
// Child extends Parent.
// Since in real world, child can have only one parent. Similarly in java, Child can extend only one parent.
// 
// Class can extend multiple interfaces. 
public class Human extends Mammal implements Walkable, Thinkable {
    private String name;
    private int age;
    private int runSpeed;

    public Human(String name, String skinColor) {
        super(skinColor);
        this.name = name;
    }

    @Override
    public void walk() {
        System.out.printf("%s is walking and my age is %i\n", name, age);
    }

    @Override
    public int run() {
        System.out.println(name + " is running.");
        return runSpeed;
    }

    @Override
    public void think() {
        System.out.println(name + " is thinking.");
        thinkThought1();
        thinkThought2();
    }

    private void thinkThought1() {
        System.out.println(name + " is thinking thought 1.");
    }

    private void thinkThought2() {
        System.out.println(name + " is thinking thought 2.");
    }
}
