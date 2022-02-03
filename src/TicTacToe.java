// a return of 'z' means that it

import java.util.Scanner;

public class TicTacToe {


    private boolean gameIsFinished = false;
    private SquareGameboard board = new SquareGameboard(3);
    private char winner;

    public TicTacToe() {
    }


    public void runGame(){
        while (!gameIsFinished){
            playerPlaysPiece(board);
            giveWinner(board);
            board.twoDimensionalArrayToString(board.getGameboard()); //TODO make a better toString() here! Ridiculous to see this line.
        }
    }

    public void quit(){}

    private void giveWinner(SquareGameboard board) {
        char winnerOnDiagonal = winnerOnDiagonal(board.getGameboard());
        char winnerOnRows = winnerOnRows(board.getGameboard());
        char winnerOnCols = winnerOnCols(board.getGameboard());

        System.out.println("winner on Dia: " + winnerOnDiagonal(board.getGameboard()));
        System.out.println("winner on Rows: " + winnerOnRows(board.getGameboard()));
        System.out.println("winner on Cols: " + winnerOnCols(board.getGameboard()));
    }

    public void playerPlaysPiece(SquareGameboard board){
        //ask for input == sep //TODO this should be a separate method
        //input into board.addPieceToBoard
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please choose x or o");
        char pieceChoice = userInput.next().charAt(0);
        int xCoordinate = userInput.nextInt();
        int yCoordinate = userInput.nextInt();
        board.addPieceToGameboard(pieceChoice, xCoordinate, yCoordinate);
    }


    public boolean isAllEqual(Piece[] array){
        for (int i = 0; i < array.length; i++){
            if(array[0].getPieceType() != array[i].getPieceType()){
                return false;
            }
        }
        return true;
    }


    public char winnerOnRows(Piece[][] matrix){
        for (int row = 0; row < matrix.length; row++){
            if (isAllEqual(matrix[row])){
                return matrix[row][0].getPieceType();
            }
        }
        return 'z';
    }

    //This doesn't work, because it doesn't only check cols right now.
//    public char winnerOnCols(Piece[][] matrix){
//        for (int i = 0; i < matrix.length; i++){
//            char firstCharOfCol = matrix[i][0].getPieceType();
//
//            for (int j = 0; j < matrix[i].length; j++) {
//                if (firstCharOfCol != matrix[i][j].getPieceType()){
//                    break;
//                }
//                else{
//                    return firstCharOfCol;
//                }
//            }
//        }
//        return 'z';
//    }

    public char winnerOnCols(Piece[][] matrix){
        for (int col = 0; col < matrix[0].length; col++){
            Piece[] colArr = new Piece[matrix.length];
            for (int row = 0; row < matrix.length; row++){
                colArr[row] = matrix[row][col];
            }
            if (isAllEqual(colArr)){
                return matrix[0][col].getPieceType();
            }
        }
        return 'z';
    }


    //WIP TODO WIP
//    public char winnerOnDiagonalLeftToRight(Piece[][] matrix){
//        char firstCharOfDia = matrix[0][0].getPieceType();
//        for (int i = 1; i < matrix.length; i++){
//            for (int j = 1; j < matrix[i].length; j++){
//
//            }
//        }
//    }

    //This code is completely wrong. it will return a winner with just 1 thing on [1][1]
    public char winnerOnDiagonal(Piece[][] matrix){
        Piece[] diagonalArray = new Piece[3];
        for (int row = 0; row < matrix.length; row++){
            for (int col = row; col < matrix[row].length; col++){ //TODO check out System.arraycopy()
                diagonalArray[col] = matrix[row][col];
            }
            if (isAllEqual(diagonalArray)){
                return matrix[1][1].getPieceType(); //So, this isn't scalable. The [1][1] is only based on a 3x3 matrix
            }                                       //Still doesn't really matter because it is TicTacToe specific
        }                                           //Or better said; it's scalable with a board that has an odd side
        return 'z';                                 //For example matrix.length/2 will always give the middle.
    }


    private void startOfGame(){

    }





//    public static void printSome() {
//        System.out.println("Some");
//    }
//
//
//    public boolean rowColEquals(Piece[] array, char pieceType){
//        for (int i = 0; i < array.length; i++){
//            char check = array[0].getPieceType();
//            if (array[i].getPieceType() != check){
//                return false;
//            }
//        }
//        return true;
//    }



}

// something like, while-loop. input request char. count which char (x or o ) was last used to determine
// legality. input request position on board. check to see for legal position.
// if checks pass, instantiate a Piece object with earlier chosen char.
// At end of every successful placement, run check for win.
// If everything is in a while loop the board can be slowly filled with freshly-made Piece/s
// Do I need a TicTacToeBoard class??

// Game logic and i/o logic should be separated, which I already do :)
// Should I separate the logic in different classes, is this okay?

