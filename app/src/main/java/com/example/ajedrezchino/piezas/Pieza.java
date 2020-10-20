package com.example.ajedrezchino.piezas;

import com.example.ajedrezchino.Coordenadas;
import com.example.ajedrezchino.posicion;

import java.util.ArrayList;

public class Pieza {

    private boolean blanca;
    //si este boobleano es falso todas son negras

    Pieza(boolean blanca) {
        this.blanca = blanca;
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

    public boolean esblanca() {
        return blanca;
    }
}

