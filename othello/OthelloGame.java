package othello;

import java.util.Random;
import java.util.Scanner;

public class OthelloGame {
    Board board; // 8x8
    Player blackPlayer;
    Player whitePlayer;
    // TODO: Game has rules.

    public void setup() {
        // Creating eveything.
        createBoard();
        createPlayers();

        // Set up discs on board.
        setupDiscs();
    }

    private void printBoard() {
        System.out.println(board.toString());
    }

    private void setupDiscs() {
        // Place 2 black and white discs at the center of the board.
        board.placeDisc(new Disc("black"), /* row = */ 3, /* col = */ 3); 
        board.placeDisc(new Disc("black"), /* row = */ 4, /* col = */ 4);
        board.placeDisc(new Disc("white"), /* row = */ 3, /* col = */ 4);
        board.placeDisc(new Disc("white"), /* row = */ 4, /* col = */ 3);
    }

    private void createBoard() {
        this.board = new Board();
    }

    private void createPlayers() {
        Player player1 = new Player(askPlayerName("player 1"));
        Player player2 = new Player(askPlayerName("player 2"));

        int coinToss = coinToss();
        this.blackPlayer = coinToss == 0 ? player1 : player2;
        this.whitePlayer = coinToss != 0 ? player1 : player2;
        System.out.println("We did a coin toss, and black player is " + this.blackPlayer.getName() + ", and white player is " + this.whitePlayer.getName());
    }

    private int coinToss() {
        Random random = new Random();
        return random.nextInt(2); // Returns a random int value between 0 to 1.
    }

    private String askPlayerName(String player) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the name of " + player);
        return scanner.nextLine(); // Here we wait for the terminal input
    }

    /**
     * Starts the game, and return the winner.
     * @return
     */
    public Player start() {
        Player player = this.blackPlayer;
        int i = 0;
        while(i++ < 1) {
            printBoard();
            System.out.println("Hey " + player.getName() + ", Where do you want to put the disc?");
            Scanner scanner = new Scanner(System.in);
            String move = scanner.nextLine();
            boolean isValidFormat = isValidFormat(move);
            System.out.println("is valid format: " + isValidFormat);
            while(!isValidFormat) {
                System.out.println("Hey " + player.getName() + ", you have typed invalid format. Please type again");
                move = scanner.nextLine();
                isValidFormat = isValidFormat(move);
            }
        }
        return this.blackPlayer;
    }

    private boolean isValidFormat(String move) {
        if (move.length() != 2) return false;
        if (move.charAt(0) < 'A' || move.charAt(0) > 'H') return false;
        if (move.charAt(1) < '0' || move.charAt(1) > '7') return false;
        return true;
    }
}
