package com.example.ajedrezchino.piezas;

import com.example.ajedrezchino.Coordenadas;
import com.example.ajedrezchino.posicion;

import java.util.ArrayList;

public class Pieza {

    private boolean pieza;
    //si este boobleano es falso todas son negras

    Pieza(boolean j) {
        this.pieza = j;
    }

    public ArrayList<Coordenadas> movperm(Coordenadas coordenadas , posicion[][] tablero){
        ArrayList<Coordenadas> movperm = new ArrayList<>();
        Coordenadas c;
        for(int i=0;i<9;i++){
            for(int j=0;j<5;j++){
                c = new Coordenadas(i,j);
                movperm.add(c);
            }
        }
        return movperm;
    }

    public boolean espieza() {
        return pieza;
    }
}

