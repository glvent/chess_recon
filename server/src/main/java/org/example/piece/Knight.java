package piece;

public class Knight extends Piece {

    public Knight(boolean isWhite, Position pos) {
        super(pos, isWhite);
        name = 'N';
    }

    @Override
    public boolean isValidMove(Position to, Position from) {
        return false;
    }
}