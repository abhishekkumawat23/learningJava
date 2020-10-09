public class Male extends Human {

    public Male(String firstName, String lastName, int age, String color) {
        super(firstName, lastName, age, color, true); // isMale = true
    }

    @Override
    public void gettingReady() {
        System.out.println("I am getting ready in style 1");
    }
}
