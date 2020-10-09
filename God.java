public class God {

    public static void main(String[] args) {
        Female chinu = new Female("Saloni", "Kumawat", 25, "White"); // Chinu is an object/instance of Human class.
        Male mehul = new Male("Mehul", "Kumawat", 21, "Black"); // Mehul is an object/instance of Human class.

        chinu.givingBirth();
        

        // Methods
        boolean isChinuTummyFull = chinu.eat("Apple", 3);
        int chinuSleepingHours = Human.sleep();
        Human.walk();

        // properties
        String chinuFirstName = chinu.firstName;
        String chinuLastName = chinu.lastName;
        int chinuAge = chinu.age;

        System.out.println("Chinu " + chinuSleepingHours + " ghante soyi hai.");
        System.out.println("Chinu ka tummy full hai?: " + isChinuTummyFull);
        System.out.println("Chinu ka first name hai: " + chinuFirstName);
        System.out.println("Chinu ka last name hai: " + chinuLastName);
        System.out.println("Chinu ki age hai: " + chinuAge);
        System.out.println("Human ki eyes ka count hai: " + Human.eyesCount);
    }
}
