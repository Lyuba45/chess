public class Horse extends ChessPiece {

    public Horse(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        int lstep = Math.abs(line-toLine);
        int cstep = Math.abs(column-toColumn);
        if (line == toLine && column == toColumn) {
            return false;
        } else if (toLine < 0 || toLine > 7 || toColumn < 0 || toColumn > 7) {
            return false;
        } else return lstep == 2 && cstep == 1 || lstep == 1 && cstep == 2;
    }

    @Override
    public String getSymbol() {
        return "H";
    }
}
