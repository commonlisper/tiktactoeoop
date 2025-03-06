package com.github.tictactoe.domain;

public interface Board {
    int dimention();

    void put(Symbol symbol, Coords coords);

    void put(Symbol symbol, int row, int col);

    Symbol get(Coords coords);

    Symbol get(int row, int col);

    boolean isEmptyCell(Coords coords);

    boolean isEmptyCell(int row, int col);

    boolean isFull();
}
