package com.example.ajedrezchino;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.example.ajedrezchino.piezas.general;

import com.example.ajedrezchino.piezas.Pieza;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    public posicion[][] tablero = new posicion[9][5];
    public TextView[][] ftablero = new TextView[9][5];
    public Coordenadas posicionclickada = new Coordenadas(0, 0);
    public int contador = 0;
    public Coordenadas ultimaposicion = null;

    Pieza xgeneral, ygeneral;

    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializartablero();
    }

    private void inicializartablero() {
        xgeneral = new general(false);
        ygeneral = new general(true);

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 5; j++) {
                tablero[i][j] = new posicion(null);
            }
        }




        tablero[4][0].setpieza(xgeneral);
        ftablero[0][0] = (TextView) findViewById(R.id.A1);
        ftablero[1][0] = (TextView) findViewById(R.id.B1);
        ftablero[2][0] = (TextView) findViewById(R.id.C1);
        ftablero[3][0] = (TextView) findViewById(R.id.D1);
        ftablero[4][0] = (TextView) findViewById(R.id.E1);
        ftablero[5][0] = (TextView) findViewById(R.id.F1);
        ftablero[6][0] = (TextView) findViewById(R.id.G1);
        ftablero[7][0] = (TextView) findViewById(R.id.H1);
        ftablero[8][0] = (TextView) findViewById(R.id.I1);

        ftablero[0][1] = (TextView) findViewById(R.id.A2);
        ftablero[1][1] = (TextView) findViewById(R.id.B2);
        ftablero[2][1] = (TextView) findViewById(R.id.C2);
        ftablero[3][1] = (TextView) findViewById(R.id.D2);
        ftablero[4][1] = (TextView) findViewById(R.id.E2);
        ftablero[5][1] = (TextView) findViewById(R.id.F2);
        ftablero[6][1] = (TextView) findViewById(R.id.G2);
        ftablero[7][1] = (TextView) findViewById(R.id.H2);
        ftablero[8][1] = (TextView) findViewById(R.id.I2);

        ftablero[0][2] = (TextView) findViewById(R.id.A3);
        ftablero[1][2] = (TextView) findViewById(R.id.B3);
        ftablero[2][2] = (TextView) findViewById(R.id.C3);
        ftablero[3][2] = (TextView) findViewById(R.id.D3);
        ftablero[4][2] = (TextView) findViewById(R.id.E3);
        ftablero[5][2] = (TextView) findViewById(R.id.F3);
        ftablero[6][2] = (TextView) findViewById(R.id.G3);
        ftablero[7][2] = (TextView) findViewById(R.id.H3);
        ftablero[8][2] = (TextView) findViewById(R.id.I3);

        ftablero[0][3] = (TextView) findViewById(R.id.A4);
        ftablero[1][3] = (TextView) findViewById(R.id.B4);
        ftablero[2][3] = (TextView) findViewById(R.id.C4);
        ftablero[3][3] = (TextView) findViewById(R.id.D4);
        ftablero[4][3] = (TextView) findViewById(R.id.E4);
        ftablero[5][3] = (TextView) findViewById(R.id.F4);
        ftablero[6][3] = (TextView) findViewById(R.id.G4);
        ftablero[7][3] = (TextView) findViewById(R.id.H4);
        ftablero[8][3] = (TextView) findViewById(R.id.I4);

        ftablero[0][4] = (TextView) findViewById(R.id.A5);
        ftablero[1][4] = (TextView) findViewById(R.id.B5);
        ftablero[2][4] = (TextView) findViewById(R.id.C5);
        ftablero[3][4] = (TextView) findViewById(R.id.D5);
        ftablero[4][4] = (TextView) findViewById(R.id.E5);
        ftablero[5][4] = (TextView) findViewById(R.id.F5);
        ftablero[6][4] = (TextView) findViewById(R.id.G5);
        ftablero[7][4] = (TextView) findViewById(R.id.H5);
        ftablero[8][4] = (TextView) findViewById(R.id.I5);


        settablero();

    }

    private void settablero() {

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 5; j++) {

                Pieza p = tablero[i][j].getpieza();
                int x;

                if (tablero[i][j].getpieza() != null) {
                    if (p instanceof general) x = 0;
                    else x = 1;

                    switch (x) {
                        case 0:
                            ftablero[i][j].setBackgroundResource(R.drawable.bgeneral);
                            break;
                        default:

                    }
                }
                else{
                    ftablero[i][j].setBackgroundResource(0);
                }
            }
        }
    }

    @Override
    public void onClick(View v) {

        String posPeca = v.getTag().toString();

        int row = Character.getNumericValue(posPeca.charAt(0));
        int col = Character.getNumericValue(posPeca.charAt(1));

        posicionclickada.setRow(row);
        posicionclickada.setCol(col);


        Log.i("vegetal", Integer.toString(row));
        Log.i("vegetal", Integer.toString(col));

        general((general) xgeneral);
       // tablero[posicionclickada.getCol()][posicionclickada.getRow()].setpieza(xgeneral);
        // ftablero[posicionclickada.getCol()][posicionclickada.getRow()].setBackgroundResource(0);
        ultimaposicion = new Coordenadas(posicionclickada.getCol(), posicionclickada.getRow());
        settablero();

    }

    public void general (general xgeneral){

        if (tablero[5][0].getpieza() == tablero[posicionclickada.getCol()][posicionclickada.getRow()].getpieza()){
            contador++;
            tablero[posicionclickada.getCol()][posicionclickada.getRow()].setpieza(xgeneral);
            if (contador == 1){
                tablero[4][0].setpieza(null);
            }
            else {
                tablero[ultimaposicion.getRow()][ultimaposicion.getCol()].setpieza(null);
            }
        }

    }
    //
}