public class Piece {

    private final char pieceType;

    Piece(char pieceType){
        this.pieceType = pieceType;
    }

    public char getPieceType() {
        return pieceType;
    }

    @Override
    public String toString() {
        return "Piece{" +
                "pieceType=" + pieceType +
                '}';
    }
}
