package othello;

public class Block {
    Disc disc;

    public void put(Disc disc) {
        this.disc = disc;
    }

    @Override
    public String toString() {
        return disc == null ? "x" : disc.toString();
    }
    
}
