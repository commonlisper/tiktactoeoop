package com.github.tictactoe.domain;

public class GameResultAnalyzer {
    private final Board board;

    public GameResultAnalyzer(Board board) {
        this.board = board;
    }

    public boolean isWin(Symbol symbol) {
        if (isRowsWin(symbol)) {
            return true;
        }

        if (isColumnsWin(symbol)) {
            return true;
        }

        if (isMainDiagWin(symbol)) {
            return true;
        }

        if (isSideDiagWin(symbol)) {
            return true;
        }

        return false;
    }

    private boolean isColumnsWin(Symbol symbol) {
        int symbolCount = 0;

        for (int row = 0; row < board.dimention(); row++) {
            symbolCount = 0;
            for (int column = 0; column < board.dimention(); column++) {
                if (board.get(row, column) == symbol) {
                    symbolCount++;
                }
            }

            if (symbolCount == board.dimention()) {
                return true;
            }
        }

        return false;
    }

    private boolean isRowsWin(Symbol symbol) {
        int symbolCount = 0;

        for (int column = 0; column < board.dimention(); column++) {
            symbolCount = 0;
            for (int row = 0; row < board.dimention(); row++) {
                if (board.get(row, column) == symbol) {
                    symbolCount++;
                }
            }

            if (symbolCount == board.dimention()) {
                return true;
            }
        }

        return false;
    }

    private boolean isMainDiagWin(Symbol symbol) {
        int symbolCount = 0;

        for (int d = 0; d < board.dimention(); d++) {
            if (board.get(d, d) == symbol) {
                symbolCount++;
            }
        }

        return symbolCount == board.dimention();
    }

    private boolean isSideDiagWin(Symbol symbol) {
        int symbolCount = 0;

        for (int row = 0; row < board.dimention(); row++) {
            for (int column = board.dimention() - 1; column >= 0; column--) {
                if (board.get(row, column) == symbol) {
                    symbolCount++;
                }
            }
        }

        return symbolCount == board.dimention();
    }

    public boolean isDraw(Symbol... symbols) {
        for (Symbol symbol : symbols) {
            if (isWin(symbol))
                return false;
        }

        return board.isFull();
    }
}
