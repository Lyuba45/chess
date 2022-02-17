public class King extends ChessPiece {
    public King(String color) {
        super(color);
    }

    public void setCheck(boolean check) {
        this.check = check;
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
            } else if (lstep > 1 || cstep > 1) {
                return false;
            } else if (toLine < 0 || toLine > 7 || toColumn < 0 || toColumn > 7) {
                return false;
            } else return (line == toLine || column == toColumn) || (lstep == cstep);
        }

    @Override
    public String getSymbol() {
        return "K";
    }

    public boolean isUnderAttack(ChessBoard chessBoard, int line, int column) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                boolean result = !this.getColor().equals(chessBoard.board[i][j].getColor()) &&
                        chessBoard.board[i][j].canMoveToPosition(chessBoard, i, j, line, column);
                if (result) return true;
            }
        }
        return false;
    }



}
