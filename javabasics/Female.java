public class Female extends Human {

    public Female(String firstName, String lastName, int age, String color) {
        super(firstName, lastName, age, color, false); // isMale = false.
    }

    public void givingBirth() {
        System.out.println(this.getFirstName() + " " + this.getLastName() + " is giving birth");
    }

    @Override
    public void gettingReady() {
        System.out.println("I am getting ready in female's style.");
    }
}
