public class Bishop extends ChessPiece {
    public Bishop(String color) {
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
        if (lstep == 0 && cstep == 0) {
            return false;
        } else if (toLine < 0 || toLine > 7 || toColumn < 0 || toColumn > 7) {
            return false;
        } else return lstep == cstep;
    }

    @Override
    public String getSymbol() {
        return "B";
    }
}
