package com.example.ajedrezchino.piezas;


import com.example.ajedrezchino.Coordenadas;
import com.example.ajedrezchino.posicion;

import java.util.ArrayList;


public class general extends Pieza {

    public general(boolean j) {
        super(j);
    }

    @Override
    public ArrayList<Coordenadas> movperm(Coordenadas coordenadas , posicion[][] tablero){
        ArrayList<Coordenadas> movperm = new ArrayList<>();
        movperm.clear();
        Coordenadas c;

        if((coordenadas.getCol()+1) <8 && (coordenadas.getRow()+1)<8){
            if(tablero[coordenadas.getCol()+1][coordenadas.getRow()+1].getpieza() == null){
                c = new Coordenadas(coordenadas.getCol()+1 , coordenadas.getRow()+1);
                movperm.add(c);
            }else{
                if(tablero[coordenadas.getCol()+1][coordenadas.getRow()+1].getpieza().espieza() != tablero[coordenadas.getCol()][coordenadas.getRow()].getpieza().espieza()){
                    c = new Coordenadas(coordenadas.getCol()+1 , coordenadas.getRow()+1);
                    movperm.add(c);
                }
            }
        }

        if((coordenadas.getRow()+1)<8){
            if(tablero[coordenadas.getCol()][coordenadas.getRow()+1].getpieza() == null){
                c = new Coordenadas(coordenadas.getCol() , coordenadas.getRow()+1);
                movperm.add(c);
            }else{
                if(tablero[coordenadas.getCol()][coordenadas.getRow()+1].getpieza().espieza() != tablero[coordenadas.getCol()][coordenadas.getRow()].getpieza().espieza()){
                    c = new Coordenadas(coordenadas.getCol() , coordenadas.getRow()+1);
                    movperm.add(c);
                }
            }
        }

        if((coordenadas.getCol()-1) >=0 && (coordenadas.getRow()+1)<8){
            if(tablero[coordenadas.getCol()-1][coordenadas.getRow()+1].getpieza() == null){
                c = new Coordenadas(coordenadas.getCol()-1 , coordenadas.getRow()+1);
                movperm.add(c);
            }else{
                if(tablero[coordenadas.getCol()-1][coordenadas.getRow()+1].getpieza().espieza() != tablero[coordenadas.getCol()][coordenadas.getRow()].getpieza().espieza()){
                    c = new Coordenadas(coordenadas.getCol()-1 , coordenadas.getRow()+1);
                    movperm.add(c);
                }
            }
        }

        if((coordenadas.getCol()+1) <8 ){
            if(tablero[coordenadas.getCol()+1][coordenadas.getRow()].getpieza() == null){
                c = new Coordenadas(coordenadas.getCol()+1 , coordenadas.getRow());
                movperm.add(c);
            }else{
                if(tablero[coordenadas.getCol()+1][coordenadas.getRow()].getpieza().espieza() != tablero[coordenadas.getCol()][coordenadas.getRow()].getpieza().espieza()){
                    c = new Coordenadas(coordenadas.getCol()+1 , coordenadas.getRow());
                    movperm.add(c);
                }
            }
        }

        if((coordenadas.getCol()-1) <8 ){
            if(tablero[coordenadas.getCol()-1][coordenadas.getRow()].getpieza() == null){
                c = new Coordenadas(coordenadas.getCol()-1 , coordenadas.getRow());
                movperm.add(c);
            }else{
                if(tablero[coordenadas.getCol()-1][coordenadas.getRow()].getpieza().espieza() != tablero[coordenadas.getCol()][coordenadas.getRow()].getpieza().espieza()){
                    c = new Coordenadas(coordenadas.getCol()-1 , coordenadas.getRow());
                    movperm.add(c);
                }
            }
        }

        if((coordenadas.getCol()+1) <8 && (coordenadas.getRow()-1)>=0){
            if(tablero[coordenadas.getCol()+1][coordenadas.getRow()-1].getpieza() == null){
                c = new Coordenadas(coordenadas.getCol()+1 , coordenadas.getRow()-1);
                movperm.add(c);
            }else{
                if(tablero[coordenadas.getCol()+1][coordenadas.getRow()-1].getpieza().espieza() != tablero[coordenadas.getCol()][coordenadas.getRow()].getpieza().espieza()){
                    c = new Coordenadas(coordenadas.getCol()+1 , coordenadas.getRow()-1);
                    movperm.add(c);
                }
            }
        }

        if((coordenadas.getRow()-1)>=0){
            if(tablero[coordenadas.getCol()][coordenadas.getRow()-1].getpieza() == null){
                c = new Coordenadas(coordenadas.getCol() , coordenadas.getRow()-1);
                movperm.add(c);
            }else{
                if(tablero[coordenadas.getCol()][coordenadas.getRow()-1].getpieza().espieza() != tablero[coordenadas.getCol()][coordenadas.getRow()].getpieza().espieza()){
                    c = new Coordenadas(coordenadas.getCol() , coordenadas.getRow()-1);
                    movperm.add(c);
                }
            }
        }

        if((coordenadas.getCol()-1) <8 && (coordenadas.getRow()-1)>=0){
            if(tablero[coordenadas.getCol()-1][coordenadas.getRow()-1].getpieza() == null){
                c = new Coordenadas(coordenadas.getCol()-1 , coordenadas.getRow()-1);
                movperm.add(c);
            }else{
                if(tablero[coordenadas.getCol()-1][coordenadas.getRow()-1].getpieza().espieza() != tablero[coordenadas.getCol()][coordenadas.getRow()].getpieza().espieza()){
                    c = new Coordenadas(coordenadas.getCol()-1 , coordenadas.getRow()-1);
                    movperm.add(c);
                }
            }
        }

        return movperm;
    }


}
