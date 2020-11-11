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

        if((coordenadas.getRow()+1) <9 && (coordenadas.getCol()+1)<9){
            if(tablero[coordenadas.getRow()+1][coordenadas.getCol()+1].getpieza() == null){
                c = new Coordenadas(coordenadas.getRow()+1 , coordenadas.getCol()+1);
                movperm.add(c);
            }else{
                if(tablero[coordenadas.getRow()+1][coordenadas.getCol()+1].getpieza().espieza() != tablero[coordenadas.getRow()][coordenadas.getCol()].getpieza().espieza()){
                    c = new Coordenadas(coordenadas.getRow()+1 , coordenadas.getCol()+1);
                    movperm.add(c);
                }
            }
        }

        if((coordenadas.getCol()+1)<9){
            if(tablero[coordenadas.getRow()][coordenadas.getCol()+1].getpieza() == null){
                c = new Coordenadas(coordenadas.getRow() , coordenadas.getCol()+1);
                movperm.add(c);
            }else{
                if(tablero[coordenadas.getRow()][coordenadas.getCol()+1].getpieza().espieza() != tablero[coordenadas.getRow()][coordenadas.getCol()].getpieza().espieza()){
                    c = new Coordenadas(coordenadas.getRow() , coordenadas.getCol()+1);
                    movperm.add(c);
                }
            }
        }

        if((coordenadas.getRow()-1) >=0 && (coordenadas.getCol()+1)<9){
            if(tablero[coordenadas.getRow()-1][coordenadas.getCol()+1].getpieza() == null){
                c = new Coordenadas(coordenadas.getRow()-1 , coordenadas.getCol()+1);
                movperm.add(c);
            }else{
                if(tablero[coordenadas.getRow()-1][coordenadas.getCol()+1].getpieza().espieza() != tablero[coordenadas.getRow()][coordenadas.getCol()].getpieza().espieza()){
                    c = new Coordenadas(coordenadas.getRow()-1 , coordenadas.getCol()+1);
                    movperm.add(c);
                }
            }
        }

        if((coordenadas.getRow()+1) <9 ){
            if(tablero[coordenadas.getRow()+1][coordenadas.getCol()].getpieza() == null){
                c = new Coordenadas(coordenadas.getRow()+1 , coordenadas.getCol());
                movperm.add(c);
            }else{
                if(tablero[coordenadas.getRow()+1][coordenadas.getCol()].getpieza().espieza() != tablero[coordenadas.getRow()][coordenadas.getCol()].getpieza().espieza()){
                    c = new Coordenadas(coordenadas.getRow()+1 , coordenadas.getCol());
                    movperm.add(c);
                }
            }
        }

        if((coordenadas.getRow()-1) <9 ){
            if(tablero[coordenadas.getRow()-1][coordenadas.getCol()].getpieza() == null){
                c = new Coordenadas(coordenadas.getRow()-1 , coordenadas.getCol());
                movperm.add(c);
            }else{
                if(tablero[coordenadas.getRow()-1][coordenadas.getCol()].getpieza().espieza() != tablero[coordenadas.getRow()][coordenadas.getCol()].getpieza().espieza()){
                    c = new Coordenadas(coordenadas.getRow()-1 , coordenadas.getCol());
                    movperm.add(c);
                }
            }
        }

        if((coordenadas.getRow()+1) <9 && (coordenadas.getCol()-1)>=0){
            if(tablero[coordenadas.getRow()+1][coordenadas.getCol()-1].getpieza() == null){
                c = new Coordenadas(coordenadas.getRow()+1 , coordenadas.getCol()-1);
                movperm.add(c);
            }else{
                if(tablero[coordenadas.getRow()+1][coordenadas.getCol()-1].getpieza().espieza() != tablero[coordenadas.getRow()][coordenadas.getCol()].getpieza().espieza()){
                    c = new Coordenadas(coordenadas.getRow()+1 , coordenadas.getCol()-1);
                    movperm.add(c);
                }
            }
        }

        if((coordenadas.getCol()-1)>=0){
            if(tablero[coordenadas.getRow()][coordenadas.getCol()-1].getpieza() == null){
                c = new Coordenadas(coordenadas.getRow() , coordenadas.getCol()-1);
                movperm.add(c);
            }else{
                if(tablero[coordenadas.getRow()][coordenadas.getCol()-1].getpieza().espieza() != tablero[coordenadas.getRow()][coordenadas.getCol()].getpieza().espieza()){
                    c = new Coordenadas(coordenadas.getRow() , coordenadas.getCol()-1);
                    movperm.add(c);
                }
            }
        }

        if((coordenadas.getRow()-1) <9 && (coordenadas.getCol()-1)>=0){
            if(tablero[coordenadas.getRow()-1][coordenadas.getCol()-1].getpieza() == null){
                c = new Coordenadas(coordenadas.getRow()-1 , coordenadas.getCol()-1);
                movperm.add(c);
            }else{
                if(tablero[coordenadas.getRow()-1][coordenadas.getCol()-1].getpieza().espieza() != tablero[coordenadas.getRow()][coordenadas.getCol()].getpieza().espieza()){
                    c = new Coordenadas(coordenadas.getRow()-1 , coordenadas.getCol()-1);
                    movperm.add(c);
                }
            }
        }

        return movperm;
    }

}
