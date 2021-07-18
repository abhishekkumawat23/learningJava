package othello;

public class Disc {
    String color;

    public Disc(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return color.equals("white") ? "w" : "b";
    }
    
}
