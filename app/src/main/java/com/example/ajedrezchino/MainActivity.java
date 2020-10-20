package com.example.ajedrezchino;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import com.example.ajedrezchino.piezas.general;

import com.example.ajedrezchino.piezas.Pieza;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    public posicion[][] tablero = new posicion[9][5];
    public posicion[][] tablero2 = new posicion[9][5];
    public TextView[][] ftablero = new TextView[9][5];
    public Coordenadas posicionclickada = new Coordenadas(0, 0);
    public Boolean algoseleccionado = false;
    public Coordenadas ultimaposicion = null ;
    public ArrayList<Coordenadas> listacoordenadas = new ArrayList<>();
    public TextView[][] fondodetablero = new TextView[9][5];

    Pieza xgeneral, ygeneral;

    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializartablero();
    }

    private void inicializartablero() {
        // "x" es la parte de arriba (negras) y "y" la de abajo de las piezas (blancas)
        xgeneral = new general(false);
        ygeneral = new general(true);

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 5; j++) {
                tablero[i][j] = new posicion(null);
                tablero2[i][j] = new posicion(null);
            }
        }

        tablero[4][1].setpieza(xgeneral);
        ftablero[4][1] = (TextView) findViewById(R.id.E1);

        for(int g=0;g<9;g++){
            for(int h=0;h<5;h++){
                if(tablero[g][h].getpieza()==null){
                    tablero2[g][h].setpieza(null);
                }else{
                    tablero2[g][h].setpieza(tablero[g][h].getpieza());
                }
            }
        }
        algoseleccionado = false;
        settablero();

    }

    private void settablero() {

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 5; j++) {

                Pieza p = tablero[i][j].getpieza();
                int x;

                if (tablero[i][j].getpieza() != null) {
                    if (p instanceof general) x = 0;
                    else x = 6;

                    switch (x) {
                        case 0:
                            ftablero[i][j].setBackgroundResource(R.drawable.bgeneral);
                            break;
                        default:

                    }
                }
            }
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.A1:
                posicionclickada = new Coordenadas(0, 0);
                break;
          /*  case R.id.B8:
                posicionclickada.setX(1);
                posicionclickada.setY(0);
                break;
            case R.id.C8:
                posicionclickada.setX(2);
                posicionclickada.setY(0);
                break;
            case R.id.D8:
                posicionclickada.setX(3);
                posicionclickada.setY(0);
                break;
            case R.id.E8:
                posicionclickada.setX(4);
                posicionclickada.setY(0);
                break;
            case R.id.F8:
                posicionclickada.setX(5);
                posicionclickada.setY(0);
                break;
            case R.id.G8:
                posicionclickada.setX(6);
                posicionclickada.setY(0);
                break;
            case R.id.H8:
                posicionclickada.setX(7);
                posicionclickada.setY(0);
                break;

            case R.id.A7:
                posicionclickada.setX(0);
                posicionclickada.setY(1);
                break;
            case R.id.B7:
                posicionclickada.setX(1);
                posicionclickada.setY(1);
                break;
            case R.id.C7:
                posicionclickada.setX(2);
                posicionclickada.setY(1);
                break;
            case R.id.D7:
                posicionclickada.setX(3);
                posicionclickada.setY(1);
                break;
            case R.id.E7:
                posicionclickada.setX(4);
                posicionclickada.setY(1);
                break;
            case R.id.F7:
                posicionclickada.setX(5);
                posicionclickada.setY(1);
                break;
            case R.id.G7:
                posicionclickada.setX(6);
                posicionclickada.setY(1);
                break;
            case R.id.H7:
                posicionclickada.setX(7);
                posicionclickada.setY(1);
                break;

            case R.id.A6:
                posicionclickada.setX(0);
                posicionclickada.setY(2);
                break;
            case R.id.B6:
                posicionclickada.setX(1);
                posicionclickada.setY(2);
                break;
            case R.id.C6:
                posicionclickada.setX(2);
                posicionclickada.setY(2);
                break;
            case R.id.D6:
                posicionclickada.setX(3);
                posicionclickada.setY(2);
                break;
            case R.id.E6:
                posicionclickada.setX(4);
                posicionclickada.setY(2);
                break;
            case R.id.F6:
                posicionclickada.setX(5);
                posicionclickada.setY(2);
                break;
            case R.id.G6:
                posicionclickada.setX(6);
                posicionclickada.setY(2);
                break;
            case R.id.H6:
                posicionclickada.setX(7);
                posicionclickada.setY(2);
                break;

             */
            case R.id.A5:
                posicionclickada.setX(0);
                posicionclickada.setY(4);
                break;
            case R.id.B5:
                posicionclickada.setX(1);
                posicionclickada.setY(4);
                break;
            case R.id.C5:
                posicionclickada.setX(2);
                posicionclickada.setY(4);
                break;
            case R.id.D5:
                posicionclickada.setX(3);
                posicionclickada.setY(4);
                break;
            case R.id.E5:
                posicionclickada.setX(4);
                posicionclickada.setY(4);
                break;
            case R.id.F5:
                posicionclickada.setX(5);
                posicionclickada.setY(4);
                break;
            case R.id.G5:
                posicionclickada.setX(6);
                posicionclickada.setY(4);
                break;
            case R.id.H5:
                posicionclickada.setX(7);
                posicionclickada.setY(4);
                break;
            case R.id.I5:
                posicionclickada.setX(8);
                posicionclickada.setY(4);
                break;

            case R.id.A4:
                posicionclickada.setX(0);
                posicionclickada.setY(3);
                break;
            case R.id.B4:
                posicionclickada.setX(1);
                posicionclickada.setY(3);
                break;
            case R.id.C4:
                posicionclickada.setX(2);
                posicionclickada.setY(3);
                break;
            case R.id.D4:
                posicionclickada.setX(3);
                posicionclickada.setY(3);
                break;
            case R.id.E4:
                posicionclickada.setX(4);
                posicionclickada.setY(3);
                break;
            case R.id.F4:
                posicionclickada.setX(5);
                posicionclickada.setY(3);
                break;
            case R.id.G4:
                posicionclickada.setX(6);
                posicionclickada.setY(3);
                break;
            case R.id.H4:
                posicionclickada.setX(7);
                posicionclickada.setY(3);
                break;

            case R.id.I4:
                posicionclickada.setX(8);
                posicionclickada.setY(3);
                break;

            case R.id.A3:
                posicionclickada.setX(0);
                posicionclickada.setY(2);
                break;
            case R.id.B3:
                posicionclickada.setX(1);
                posicionclickada.setY(2);
                break;
            case R.id.C3:
                posicionclickada.setX(2);
                posicionclickada.setY(2);
                break;
            case R.id.D3:
                posicionclickada.setX(3);
                posicionclickada.setY(2);
                break;
            case R.id.E3:
                posicionclickada.setX(4);
                posicionclickada.setY(2);
                break;
            case R.id.F3:
                posicionclickada.setX(5);
                posicionclickada.setY(2);
                break;
            case R.id.G3:
                posicionclickada.setX(6);
                posicionclickada.setY(2);
                break;
            case R.id.H3:
                posicionclickada.setX(7);
                posicionclickada.setY(2);
                break;

            case R.id.I3:
                posicionclickada.setX(8);
                posicionclickada.setY(2);
                break;

            case R.id.A2:
                posicionclickada.setX(0);
                posicionclickada.setY(1);
                break;
            case R.id.B2:
                posicionclickada.setX(1);
                posicionclickada.setY(1);
                break;
            case R.id.C2:
                posicionclickada.setX(2);
                posicionclickada.setY(1);
                break;
            case R.id.D2:
                posicionclickada.setX(3);
                posicionclickada.setY(1);
                break;
            case R.id.E2:
                posicionclickada.setX(4);
                posicionclickada.setY(1);
                break;
            case R.id.F2:
                posicionclickada.setX(5);
                posicionclickada.setY(1);
                break;
            case R.id.G2:
                posicionclickada.setX(6);
                posicionclickada.setY(1);
                break;
            case R.id.H2:
                posicionclickada.setX(7);
                posicionclickada.setY(1);
                break;

            case R.id.I2:
                posicionclickada.setX(8);
                posicionclickada.setY(1);
                break;

            case R.id.B1:
                posicionclickada.setX(1);
                posicionclickada.setY(0);
                break;
            case R.id.C1:
                posicionclickada.setX(2);
                posicionclickada.setY(0);
                break;
            case R.id.D1:
                posicionclickada.setX(3);
                posicionclickada.setY(0);
                break;

            case R.id.E1:
                posicionclickada.setX(4);
                posicionclickada.setY(0);
                break;

            case R.id.F1:
                posicionclickada.setX(5);
                posicionclickada.setY(0);
                break;
            case R.id.G1:
                posicionclickada.setX(6);
                posicionclickada.setY(0);
                break;
            case R.id.H1:
                posicionclickada.setX(7);
                posicionclickada.setY(0);
                break;

            case R.id.I1:
                posicionclickada.setX(8);
                posicionclickada.setY(0);
                break;


        }
        settablero();
    }
}