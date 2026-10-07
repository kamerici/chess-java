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

    public boolean positionExistis(int row, int column) {
        return row >= 0 && row < rows
                && column >= 0 && column < columns;
    }

    public void placePiece(ChessPiece piece, Position position) {
        if (thereIsAPiece(position)) {
            throw new IllegalStateException("There is already a piece on position " + position);
        }
        pieces[position.getRow()][position.getColumn()] = piece;
        piece.setPosition(position);
    }

    public boolean thereIsAPiece(Position position) {
        return pieces[position.getRow()][position.getColumn()] != null;
    }

    public ChessPiece removePiece(Position position) {
        if (!thereIsAPiece(position)) {
            return null;
        }
        ChessPiece aux = pieces[position.getRow()][position.getColumn()];
        aux.setPosition(null);

        pieces[position.getRow()][position.getColumn()] = null;

        return aux;
    }
}
