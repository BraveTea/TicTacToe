public class Programme {
    public static void main(String[] args){
        System.out.println("config");
        MyUsefulFunctions func = new MyUsefulFunctions();

        SquareGameboard board1 = new SquareGameboard(3);
        TicTacToe ticTacToe = new TicTacToe();

        ticTacToe.runGame();
//
//        board1.addPieceToGameboard('x', 0,0);
//        board1.addPieceToGameboard('o', 0,1);
//        board1.addPieceToGameboard('o', 0,2);
//        board1.addPieceToGameboard('0', 1,0);
//        board1.addPieceToGameboard('x', 1,1);
//        board1.addPieceToGameboard('o', 1,2);
//        board1.addPieceToGameboard('o', 2,0);
//        board1.addPieceToGameboard('o', 2,1);
//        board1.addPieceToGameboard('x', 2,2);
//
//        board1.twoDimensionalArrayToString(board1.getGameboard());
//        System.out.println(ticTacToe.winnerOnRows(board1.getGameboard()));
//        System.out.println(ticTacToe.winnerOnCols(board1.getGameboard()));
//        System.out.println(ticTacToe.winnerOnDiagonal(board1.getGameboard()));



        /*
        [0][0]  [0][1]  [0][2]
        [1][0]  [1][1]  [1][2]
        [2][0]  [2][1]  [2][2]

        */

//        Piece[][] testMatrix = new Piece[3][3];
//
//        testMatrix[0][0] = new Piece('x');
//        testMatrix[1][0] = new Piece('o');
//        testMatrix[2][0] = new Piece('x');
//
//        testMatrix[0][1] = new Piece('o');
//        testMatrix[1][1] = new Piece('x');
//        testMatrix[2][1] = new Piece('o');
//
//        testMatrix[0][2] = new Piece('o');
//        testMatrix[1][2] = new Piece('x');
//        testMatrix[2][2] = new Piece('x');
//
//
//        board1.twoDimensionalArrayToString(board1.getGameboard());
//
//        System.out.println(ticTacToe.winnerOnRows(testMatrix));
//
//        System.out.println(ticTacToe.winnerOnCols(testMatrix));
//
//        System.out.println(ticTacToe.winnerOnDiagonal(testMatrix));


    }

}




// something like, while-loop. input request char. count which char (x or o ) was last used to determine
// legality. input request position on board. check to see for legal position.
// if checks pass, instantiate a Piece object with earlier chosen char.
// At end of every successful placement, run check for win.
// If everything is in a while loop the board can be slowly filled with freshly-made Piece/s
// Do I need a TicTacToeBoard class??