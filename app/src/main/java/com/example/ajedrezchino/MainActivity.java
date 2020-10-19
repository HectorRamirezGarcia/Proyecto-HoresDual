package com.example.ajedrezchino;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.example.ajedrezchino.piezas.general;

import com.example.ajedrezchino.piezas.Pieza;

public class MainActivity extends AppCompatActivity {

    public posicion[][] tablero = new posicion[5][9];
    public TextView[][] ftablero = new TextView[5][9];
    public Coordenadas posicionclickada = new Coordenadas(0, 0);

    Pieza xgeneral, ygeneral;

    private void inicializartablero() {
        // "x" es la parte de arriba (negras) y "y" la de abajo de las piezas (blancas)
        xgeneral = new general(false);
        ygeneral = new general(true);

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                tablero[i][j] = new posicion(null);
            }
        }

        tablero[0][5].setpieza(xgeneral);
        ftablero[0][5] = (TextView) findViewById(R.id.E1);


    }

    private void settablero() {

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {

                Pieza p = tablero[i][j].getpieza();
                int x;

                if (tablero[i][j].getpieza() != null) {
                    if (p instanceof general) x = 0;
                    else x = 6;

                    switch (x) {
                        case 0:
                            ftablero[i][j].setBackgroundResource(R.drawable._200px_xiangqi_black_side_general_svg);
                            break;
                        default:

                    }
                }else{
                    ftablero[i][j].setBackgroundResource(0);
                }
            }
        }
    }

    @Override
    public void onClick(View v) {
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}