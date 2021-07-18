package othello;

public class Board {
    Block[][] blocks = new Block[8][8];

    public Board() {
        // When we create board, we also create 8x8 blocks array.

        for (int i = 0; i < blocks.length; i++) {
            for (int j = 0; j < blocks[i].length; j++) {
                blocks[i][j] = new Block();
            }
        }
    }

    public void placeDisc(Disc disc, int row, int col) {
        blocks[row][col].put(disc);
    }
    
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        // Print ABCD's
        builder.append("  ");
        for (int i = 0; i < blocks.length; i++) {
            builder.append((char)('A' + i) + " ");
        }
        builder.append("\n");

        // Print everything else.
        for (int i = 0; i < blocks.length; i++) {
            builder.append(i + " "); // Printing row number.
            for(int j = 0; j < blocks[i].length; j++) {
                Block block = blocks[i][j];
                builder.append(block.toString() + " ");
            }
            builder.append("\n");
        }
        return builder.toString();
    }
}
