import java.util.Arrays;

public class SquareGameboard {

    private final int size;
    private Piece[][] gameboard;

    //perhaps the board should be filled with empty objects and replaced.
    //reason is: I don't know what a null value will do to my code.

    public SquareGameboard(int size) {
        this.size = size;
        gameboard = new Piece[size][size];
    }

    public void addPieceToGameboard(Piece piece, int row, int col){
        gameboard[row][col] = piece;
    }

    public Piece[][] getGameboard() {
        return gameboard;
    }


    public int getSize(){
        return size;
    }

    @Override
    public String toString() {
        return "SquareGameboard{" +
                "size=" + size +
                ", gameboard=" + Arrays.toString(gameboard) +
                '}';
    }

    void twoDimensionalArrayToString(Object[][] array){

        for (int row = 0; row < array.length; row++){
            for (int col = 0; col < array[row].length; col++){
                System.out.printf("%s \t", array[row][col]);
            }
            System.out.printf("%n");
        }
    }
}
