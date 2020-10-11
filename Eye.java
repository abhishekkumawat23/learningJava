public class Eye implements EyeInterface {
    // Properties/instaance variables
    // Methods
    // Constructor

    private String color;
    private boolean isLeft;

    public Eye(String color, boolean isLeft) {
        this.color = color;
        this.isLeft = isLeft;
    }

    public void blink() {
        System.out.println("I am blinking");
        closeEyes();
        openEyes();
    }

    public void crying() {
        System.out.println("I cam crying, so tears are coming");
    }

    public void seeing() {
        System.out.println("I am seeing the world");
    }

    // private and public are called access modifiers.
    private void closeEyes() {
        System.out.println("I am closing my eyes");
    }

    private void openEyes() {
        System.out.println("I am opening my eyes");
    }
}
