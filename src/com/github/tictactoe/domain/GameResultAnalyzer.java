package com.github.tictactoe.domain;

public class GameResultAnalyzer {
    private final Board board;

    public GameResultAnalyzer(Board board) {
        this.board = board;
    }

    public boolean isWin(Symbol symbol) {
        // for (int i = 0; i < board.dimention(); i++) {
        // for (int j = 0; j < board.dimention(); j++) {

        // }
        // }

        return false;
    }

    public boolean isDraw(Symbol... symbols) {
        for (Symbol symbol : symbols) {
            if (isWin(symbol))
                return false;
        }

        return board.isFull();
    }
}
