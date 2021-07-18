package othello;

public class PlayOthello {

    public static void main(String[] args) {
        play();
    }

    private static void play() {
        OthelloGame game = new OthelloGame();
        game.setup();
        Player winner = game.start();
        System.out.println("Winner of othello game is: " + winner.getName());
    }
}
