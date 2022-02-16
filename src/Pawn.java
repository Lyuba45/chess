public class Pawn extends ChessPiece {
    public Pawn(String color) {
        super(color);
    }

    @Override
    public String getColor()  {
        return this.color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        boolean isWhite = color.equals("White");
        if (line == toLine) {
            return false;
        } else if (toLine < 0 || toLine > 7 || toColumn < 0 || toColumn > 7) {
            return false;
        } else if ((isWhite && line == 1) && !(toLine == 2 || toLine == 3)) {
            return false;
        } else if ((isWhite) && !(toLine - line == 1)) {
            return false;
        } else if ((!isWhite && line == 7) && !(toLine == 6 || toLine == 5)) {
            return false;
        } else return (isWhite) || line - toLine == 1;
    }

    @Override
    public String getSymbol() {
        return "P";
    }
}
