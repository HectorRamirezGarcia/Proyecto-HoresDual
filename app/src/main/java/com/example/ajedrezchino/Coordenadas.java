package com.example.ajedrezchino;

public class Coordenadas {

    private int x;
    private int y;

    public Coordenadas(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void setX(int x)
    {
        this.x = x;
    }

    public int getX() {

        return x;
    }

    public int getY() {

        return y;
    }

    void setY(int y) {
        this.y = y;
    }
}
