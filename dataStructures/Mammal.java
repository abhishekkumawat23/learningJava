package dataStructures;

public class Mammal extends Animal {
    private int babiesCount = 0;
    private Skin skin;

    public Mammal() {}

    public Mammal(String skinColor) {
        super();
        this.skin = new Skin(skinColor);
    }

    public void reproduce() {
        System.out.println("I am reproducing.");
        babiesCount++;
    }
    
}
