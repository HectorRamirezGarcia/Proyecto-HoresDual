package com.example.ajedrezchino;

public class Coordenadas {

    private int row;
    private int col;

    public Coordenadas(int row, int col) {
        this.row = row;
        this.col = col;
    }

    void setRow(int row)
    {
        this.row = row;
    }

    public int getRow() {

        return row;
    }

    public int getCol() {

        return col;
    }

    void setCol(int col) {
        this.col = col;
    }
}
