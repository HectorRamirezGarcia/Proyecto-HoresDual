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

        if((coordenadas.getX()+1) <9 && (coordenadas.getY()+1)<9){
            if(tablero[coordenadas.getX()+1][coordenadas.getY()+1].getpieza() == null){
                c = new Coordenadas(coordenadas.getX()+1 , coordenadas.getY()+1);
                movperm.add(c);
            }else{
                if(tablero[coordenadas.getX()+1][coordenadas.getY()+1].getpieza().espieza() != tablero[coordenadas.getX()][coordenadas.getY()].getpieza().espieza()){
                    c = new Coordenadas(coordenadas.getX()+1 , coordenadas.getY()+1);
                    movperm.add(c);
                }
            }
        }

        if((coordenadas.getY()+1)<9){
            if(tablero[coordenadas.getX()][coordenadas.getY()+1].getpieza() == null){
                c = new Coordenadas(coordenadas.getX() , coordenadas.getY()+1);
                movperm.add(c);
            }else{
                if(tablero[coordenadas.getX()][coordenadas.getY()+1].getpieza().espieza() != tablero[coordenadas.getX()][coordenadas.getY()].getpieza().espieza()){
                    c = new Coordenadas(coordenadas.getX() , coordenadas.getY()+1);
                    movperm.add(c);
                }
            }
        }

        if((coordenadas.getX()-1) >=0 && (coordenadas.getY()+1)<9){
            if(tablero[coordenadas.getX()-1][coordenadas.getY()+1].getpieza() == null){
                c = new Coordenadas(coordenadas.getX()-1 , coordenadas.getY()+1);
                movperm.add(c);
            }else{
                if(tablero[coordenadas.getX()-1][coordenadas.getY()+1].getpieza().espieza() != tablero[coordenadas.getX()][coordenadas.getY()].getpieza().espieza()){
                    c = new Coordenadas(coordenadas.getX()-1 , coordenadas.getY()+1);
                    movperm.add(c);
                }
            }
        }

        if((coordenadas.getX()+1) <9 ){
            if(tablero[coordenadas.getX()+1][coordenadas.getY()].getpieza() == null){
                c = new Coordenadas(coordenadas.getX()+1 , coordenadas.getY());
                movperm.add(c);
            }else{
                if(tablero[coordenadas.getX()+1][coordenadas.getY()].getpieza().espieza() != tablero[coordenadas.getX()][coordenadas.getY()].getpieza().espieza()){
                    c = new Coordenadas(coordenadas.getX()+1 , coordenadas.getY());
                    movperm.add(c);
                }
            }
        }

        if((coordenadas.getX()-1) <9 ){
            if(tablero[coordenadas.getX()-1][coordenadas.getY()].getpieza() == null){
                c = new Coordenadas(coordenadas.getX()-1 , coordenadas.getY());
                movperm.add(c);
            }else{
                if(tablero[coordenadas.getX()-1][coordenadas.getY()].getpieza().espieza() != tablero[coordenadas.getX()][coordenadas.getY()].getpieza().espieza()){
                    c = new Coordenadas(coordenadas.getX()-1 , coordenadas.getY());
                    movperm.add(c);
                }
            }
        }

        if((coordenadas.getX()+1) <9 && (coordenadas.getY()-1)>=0){
            if(tablero[coordenadas.getX()+1][coordenadas.getY()-1].getpieza() == null){
                c = new Coordenadas(coordenadas.getX()+1 , coordenadas.getY()-1);
                movperm.add(c);
            }else{
                if(tablero[coordenadas.getX()+1][coordenadas.getY()-1].getpieza().espieza() != tablero[coordenadas.getX()][coordenadas.getY()].getpieza().espieza()){
                    c = new Coordenadas(coordenadas.getX()+1 , coordenadas.getY()-1);
                    movperm.add(c);
                }
            }
        }

        if((coordenadas.getY()-1)>=0){
            if(tablero[coordenadas.getX()][coordenadas.getY()-1].getpieza() == null){
                c = new Coordenadas(coordenadas.getX() , coordenadas.getY()-1);
                movperm.add(c);
            }else{
                if(tablero[coordenadas.getX()][coordenadas.getY()-1].getpieza().espieza() != tablero[coordenadas.getX()][coordenadas.getY()].getpieza().espieza()){
                    c = new Coordenadas(coordenadas.getX() , coordenadas.getY()-1);
                    movperm.add(c);
                }
            }
        }

        if((coordenadas.getX()-1) <9 && (coordenadas.getY()-1)>=0){
            if(tablero[coordenadas.getX()-1][coordenadas.getY()-1].getpieza() == null){
                c = new Coordenadas(coordenadas.getX()-1 , coordenadas.getY()-1);
                movperm.add(c);
            }else{
                if(tablero[coordenadas.getX()-1][coordenadas.getY()-1].getpieza().espieza() != tablero[coordenadas.getX()][coordenadas.getY()].getpieza().espieza()){
                    c = new Coordenadas(coordenadas.getX()-1 , coordenadas.getY()-1);
                    movperm.add(c);
                }
            }
        }

        return movperm;
    }

}
