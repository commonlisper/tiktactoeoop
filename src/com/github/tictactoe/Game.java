package com.github.tictactoe;

import com.github.tictactoe.domain.Board;
import com.github.tictactoe.domain.BoardImp;
import com.github.tictactoe.domain.GameResultAnalyzer;
import com.github.tictactoe.domain.Symbol;
import com.github.tictactoe.view.BoardRenderer;

public class Game {
    public void start() {
        Board board = new BoardImp();
        board.put(Symbol.X, 0, 0);
        board.put(Symbol.O, 1, 1);
        board.put(Symbol.X, 2, 2);
        board.put(Symbol.O, 0, 1);
        board.put(Symbol.O, 0, 2);
        board.put(Symbol.O, 1, 2);
        board.put(Symbol.X, 1, 0);
        board.put(Symbol.X, 2, 0);
        board.put(Symbol.O, 2, 1);

        BoardRenderer renderer = new BoardRenderer(board);
        System.out.println(renderer.render());

        GameResultAnalyzer resultAnalyzer = new GameResultAnalyzer(board);
        System.out.println(resultAnalyzer.isWin(Symbol.O));
        System.out.println(resultAnalyzer.isWin(Symbol.X));

        System.out.println("is full? => " + board.isFull());
    }
}
