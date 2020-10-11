public class God {

    public static void main(String[] args) {
        Female chinu = new Female("Saloni", "Kumawat", 25, "White"); // Chinu is an object/instance of Human class.
        Male mehul = new Male("Mehul", "Kumawat", 21, "Black"); // Mehul is an object/instance of Human class.

        chinu.givingBirth();
        // chinu.gettingReady();

        // Methods
        boolean isChinuTummyFull = chinu.eat("Apple", 3); // Day 1
        chinu.eat("Orange", 5); // Day 2
        chinu.eat("Apple", 1);
        chinu.eat("Apple", 2);
        chinu.eat(5);
        chinu.eat(4);
        chinu.eat("Malai Kulfi", 2);

        System.out.println("Chinu ka gender hai - isMale: " + chinu.getIsMale());
        chinu.gettingReady();
        chinu.setAge(-10);

        chinu.getLeftEye().blink();

        int chinuSleepingHours = Human.sleep();
        Human.walk();

        // properties
        String chinuFirstName = chinu.getFirstName();
        String chinuLastName = chinu.getLastName();
        int chinuAge = chinu.getAge();

        System.out.println("Chinu " + chinuSleepingHours + " ghante soyi hai.");
        System.out.println("Chinu ka tummy full hai?: " + isChinuTummyFull);
        System.out.println("Chinu ka first name hai: " + chinuFirstName);
        System.out.println("Chinu ka last name hai: " + chinuLastName);
        System.out.println("Chinu ki age hai: " + chinuAge);
        System.out.println("Human ki eyes ka count hai: " + Human.eyesCount);
    }
}
