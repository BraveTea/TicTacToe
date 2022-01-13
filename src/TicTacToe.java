public class TicTacToe {

    private Piece[][] board = new Piece[3][3];
    private boolean gameIsFinished = false;

    public TicTacToe() {
    }



    public boolean isAllEqual(Piece[] array){
        char pieceType = array[0].getPieceType();
        for (int i = 0; i < array.length; i++){
            if(pieceType != array[i].getPieceType()){
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

