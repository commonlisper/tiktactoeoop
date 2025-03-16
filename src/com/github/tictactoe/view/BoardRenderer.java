package com.github.tictactoe.view;

import com.github.tictactoe.domain.Board;

public class BoardRenderer {
    private final Board board;

    public BoardRenderer(Board board) {
        this.board = board;
    }

    public String render() {
        StringBuilder view = new StringBuilder();

        for (int row = 0; row < board.dimention(); row++) {
            for (int column = 0; column < board.dimention(); column++) {
                view.append(board.get(row, column)).append(" ");
            }
            view.append("\n");
        }

        return view.toString();
    }
}
