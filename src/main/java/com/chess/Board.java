package com.chess;

public class Board {

    private int rows;
    private int columns;
    private ChessPiece[][] pieces;

    public Board (int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        pieces = new ChessPiece[rows][columns];
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }
}
