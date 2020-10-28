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

    private boolean isMale;
    private EyeInterface leftEye;
    private EyeInterface rightEye;
    private int age = 0;
    private String firstName = "Abhi";
    private String lastName = "";
    private String color = "";

    // Getter
    public boolean getIsMale() {
        return this.isMale;
    }

    public EyeInterface getLeftEye() {
        return this.leftEye;
    }

    public EyeInterface getRightEye() {
        return this.rightEye;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getColor() {
        return this.color;
    }

    // Case 1: Get but not set.
    // Case 2: Set but not get.
    // Case 3: no get, and no set.
    // Case 4: get, and set both.

    // Benefits:
    // 1. Flexibility between setting access for get and set. Examples: Case 1, 2, 3
    // 2. Validation checks on set. Examples: Case 4.
    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100) {
            System.out.println("This age is not supported");
        } else {
            this.age = age;
        }
    }

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

    // EyeInterface leftEye = new Eye("blue", true);

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

    public boolean eat(int times) {
        return eat("Apple", times);
    }


    public static int sleep() {
        System.out.println("I am sleeping now.");
        return 8; // Sleeping 8 hours.
    }

    public static void walk() {
        System.out.println("I am walking now.");
    }
}