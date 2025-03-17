package com.github.tictactoe.domain;

public class BoardImp implements Board {

    private final static int DEFAULT_DIMENSION = 3;

    private final Symbol[][] symbols;
    private final int dimension;

    public BoardImp() {
        this(DEFAULT_DIMENSION);
    }

    public BoardImp(int dimension) {
        this.dimension = dimension;
        this.symbols = new Symbol[dimension][dimension];
    }

    @Override
    public int dimention() {
        return dimension;
    }

    @Override
    public void put(Symbol symbol, Coords coords) {
        put(symbol, coords.row(), coords.col());
    }

    @Override
    public void put(Symbol symbol, int row, int col) {
        if (isEmptyCell(row, col)) {
            symbols[row][col] = symbol;
        }
    }

    @Override
    public Symbol get(Coords coords) {
        return get(coords.row(), coords.col());
    }

    @Override
    public Symbol get(int row, int col) {
        return symbols[row][col];
    }

    @Override
    public boolean isEmptyCell(Coords coords) {
        return isEmptyCell(coords.row(), coords.col());
    }

    @Override
    public boolean isEmptyCell(int row, int col) {
        return symbols[row][col] == null;
    }

    @Override
    public boolean isFull() {
        for (int row = 0; row < dimention(); row++) {
            for (int column = 0; column < dimention(); column++) {
                if (isEmptyCell(row, column))
                    return false;
            }
        }

        return true;
    }

}
