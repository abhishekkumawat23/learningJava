// Class is a template
public abstract class Human {
    // Methods / Functions
    // Properties / Variables
    // Constructor

    // Scope: method variable, instance variable, static variable
    public static int eyesCount = 2;
    public static int legsCount = 2;
    public static int noseCount = 1;
    public static int handCount = 2;
    public static String hindiTranslation = "insaan";

    public boolean isMale;
    public Eye leftEye;
    public Eye rightEye;
    public int age = 0;
    public String firstName = "";
    public String lastName = "";
    public String color = "";

    // Constructor is also a method, but a special kind of method.

    // Constructor - name should be same as class name.
    // first, last, meriAge, meraColor are parameters of constructor.
    public Human(String firstName, String lastName, int age, String color, boolean isMale) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.color = color;
        this.isMale = isMale;

        this.leftEye = new Eye("blue", true); // isLeft = true;
        this.rightEye = new Eye("blue", false); // isRight = true;
    }

    public abstract void gettingReady();

    // Methods
    public boolean eat(String itemToEat, int times) {
        System.out.println(this.firstName + " " + this.lastName + " will eat " + itemToEat + " " + times + " times.");
        if (times < 4) {
            return false; // Tummy not full.
        } else {
            return true; // Tummy full.
        }
    }

    public static int sleep() {
        System.out.println("I am sleeping now.");
        return 8; // Sleeping 8 hours.
    }

    public static void walk() {
        System.out.println("I am walking now.");
    }
}