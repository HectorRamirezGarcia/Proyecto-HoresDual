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
    public posicion[][] tablero2 = new posicion[9][5];
    public TextView[][] ftablero = new TextView[9][5];
    public TextView[][] fondodetablero = new TextView[9][5];
    public ArrayList<posicion[][]> ultimovimiento = new ArrayList<>();
    public TextView juego_terminado,titulo,ganador;
    public Coordenadas posicionclickada = new Coordenadas(0, 0);
    public ArrayList<Coordenadas> listacoordenadas = new ArrayList<>();
    public Boolean algoseleccionado = false;
    public LinearLayout opciones_peon;
    public Boolean Primerturno;
    public Boolean eleccion;
    public Coordenadas ultimaposicion = null ;
    public int numeromovimientos;

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

       // tablero[posicionclickada.getCol()][posicionclickada.getRow()].setpieza(new general(true));
      //  ftablero[posicionclickada.getCol()][posicionclickada.getRow()].setBackgroundResource(0);
       // settablero();

        if (!algoseleccionado) {
            if(tablero[posicionclickada.getCol()][posicionclickada.getRow()].getpieza() == null) {
                reypeligro();
                return;
            }else{
                if(tablero[posicionclickada.getCol()][posicionclickada.getRow()].getpieza().espieza() != Primerturno){
                    reypeligro();
                    return;
                }else{
                    listacoordenadas.clear();
                    listacoordenadas = tablero[posicionclickada.getCol()][posicionclickada.getRow()].getpieza().movperm(posicionclickada, tablero);
                    fondodetablero[posicionclickada.getCol()][posicionclickada.getRow()].setBackgroundResource(R.color.colorWhite);
                    setColorposicionperm(listacoordenadas);
                    algoseleccionado = true;
                }
            }
        } else {
            if(tablero[posicionclickada.getCol()][posicionclickada.getRow()].getpieza() == null){
                if(moverselec(listacoordenadas , posicionclickada)){

                    registrotablero();
                    if(tablero[posicionclickada.getCol()][posicionclickada.getRow()].getpieza() instanceof general){
                        if(tablero[posicionclickada.getCol()][posicionclickada.getRow()].getpieza().espieza() != Primerturno){
                            juego_terminado.setVisibility(View.VISIBLE);

                            //test
                            titulo.setVisibility(View.INVISIBLE);
                        }
                    }
                    tablero[posicionclickada.getCol()][posicionclickada.getRow()].setpieza(tablero[ultimaposicion.getCol()][ultimaposicion.getRow()].getpieza());
                    tablero[ultimaposicion.getCol()][ultimaposicion.getRow()].setpieza(null);

                    reypeligro();
                    resetcolorposicionperm(listacoordenadas);
                    ftablero[ultimaposicion.getCol()][ultimaposicion.getRow()].setBackgroundResource(0);
                    resetColorAtultimaposicionition(ultimaposicion);
                    algoseleccionado = false;
                    Primerturno = !Primerturno;

                }else{
                    resetColorAtultimaposicionition(ultimaposicion);
                    resetcolorposicionperm(listacoordenadas);
                    algoseleccionado = false;
                }

            }else{
                if(tablero[posicionclickada.getCol()][posicionclickada.getRow()].getpieza() == null) {
                    reypeligro();
                    return;

                }else{
                    if(tablero[posicionclickada.getCol()][posicionclickada.getRow()].getpieza() !=null){
                        if(tablero[posicionclickada.getCol()][posicionclickada.getRow()].getpieza().espieza() != Primerturno){
                            if(moverselec(listacoordenadas , posicionclickada)){
                                registrotablero();

                                //si la reina muere esto es global tanto como si muere la tuya como la de el
                                //el metodo instanceof es -> SI ES UN
                                if(tablero[posicionclickada.getCol()][posicionclickada.getRow()].getpieza() instanceof general){
                                    if(tablero[posicionclickada.getCol()][posicionclickada.getRow()].getpieza().espieza() != Primerturno){
                                        juego_terminado.setVisibility(View.VISIBLE);
                                    }
                                }

                                //si muere el rey negro
                                if(tablero[posicionclickada.getCol()][posicionclickada.getRow()].getpieza() == xgeneral){
                                    String seleplayer1 = (String) getIntent().getStringExtra("JUGADOR1");
                                    ganador.setVisibility(View.VISIBLE);
                                    ganador.setText(seleplayer1+" Ha ganado");

                                    //titulo.setVisibility(View.INVISIBLE);
                                }

                                //si muere el rey blanco
                                if(tablero[posicionclickada.getCol()][posicionclickada.getRow()].getpieza() == ygeneral){
                                    //titulo.setVisibility(View.INVISIBLE);

                                    String seleplayer2 = (String) getIntent().getStringExtra("JUGADOR2");
                                    ganador.setVisibility(View.VISIBLE);
                                    ganador.setText(seleplayer2+" Ha ganado");
                                }

                                tablero[posicionclickada.getCol()][posicionclickada.getRow()].setpieza(tablero[ultimaposicion.getCol()][ultimaposicion.getRow()].getpieza());
                                tablero[ultimaposicion.getCol()][ultimaposicion.getRow()].setpieza(null);

                                resetcolorposicionperm(listacoordenadas);
                                ftablero[ultimaposicion.getCol()][ultimaposicion.getRow()].setBackgroundResource(0);
                                resetColorAtultimaposicionition(ultimaposicion);

                                algoseleccionado = false;
                                Primerturno = !Primerturno;
                            }else{
                                resetColorAtultimaposicionition(ultimaposicion);
                                resetcolorposicionperm(listacoordenadas);
                                algoseleccionado = false;
                            }

                        }else{
                            if(tablero[posicionclickada.getCol()][posicionclickada.getRow()].getpieza().espieza() != Primerturno){
                                reypeligro();
                                return;
                            }

                            resetColorAtultimaposicionition(ultimaposicion);
                            resetcolorposicionperm(listacoordenadas);

                            listacoordenadas.clear();
                            listacoordenadas = tablero[posicionclickada.getCol()][posicionclickada.getRow()].getpieza().movperm(posicionclickada, tablero);
                            fondodetablero[posicionclickada.getCol()][posicionclickada.getRow()].setBackgroundResource(R.color.colorWhite);
                            setColorposicionperm(listacoordenadas);
                            algoseleccionado = true;
                        }
                    }
                }
            }
        }

        reypeligro();
        ultimaposicion = new Coordenadas(posicionclickada.getCol(), posicionclickada.getRow());
        settablero();
    }

    public void registrotablero(){
        numeromovimientos++;
        ultimovimiento.add(numeromovimientos-1 ,tablero2 );

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                ultimovimiento.get(numeromovimientos-1)[i][j] = new posicion(null);
            }
        }

        for(int g=0;g<8;g++){
            for(int h=0;h<8;h++){
                if(tablero[g][h].getpieza()==null){
                    ultimovimiento.get(numeromovimientos-1)[g][h].setpieza(null);
                }else{
                    ultimovimiento.get(numeromovimientos-1)[g][h].setpieza(tablero[g][h].getpieza());
                }
            }
        }
    }

    //Opcion para volver atras
    public void atras(View v){
        if(numeromovimientos>0) {

            for(int g=0;g<8;g++){
                for(int h=0;h<8;h++){
                    if(ultimovimiento.get(numeromovimientos-1)[g][h].getpieza()==null){
                        tablero[g][h].setpieza(null);
                    }else{
                        tablero[g][h].setpieza(ultimovimiento.get(numeromovimientos-1)[g][h].getpieza());
                    }
                }
            }
            numeromovimientos--;

            settablero();
            for(int i=0;i<8;i++){
                for(int j=0;j<8;j++){
                    if((i+j)%2==0){
                        fondodetablero[i][j].setBackgroundResource(R.color.colorPrimaryDark);
                    }else{
                        fondodetablero[i][j].setBackgroundResource(R.color.colorWhite);
                    }
                }
            }
            reypeligro();
            Primerturno = !Primerturno;
            juego_terminado.setVisibility(View.INVISIBLE);
        }
    }

    private void resetcolorposicionperm(ArrayList<Coordenadas> listacoordenadas) {
        for(int i=0; i<listacoordenadas.size(); i++){
            if((listacoordenadas.get(i).getCol() + listacoordenadas.get(i).getRow())%2==0){
                fondodetablero[listacoordenadas.get(i).getCol()][listacoordenadas.get(i).getRow()].setBackgroundResource(R.color.colorPrimaryDark);
            }else {
                fondodetablero[listacoordenadas.get(i).getCol()][listacoordenadas.get(i).getRow()].setBackgroundResource(R.color.colorWhite);
            }
        }
    }

    void setColorposicionperm(ArrayList<Coordenadas> list){

        for(int i=0; i<list.size(); i++){
            if(tablero[list.get(i).getCol()][list.get(i).getRow()].getpieza() == null){
                fondodetablero[list.get(i).getCol()][list.get(i).getRow()].setBackgroundResource(R.color.colorWhite);
            }else{
                fondodetablero[list.get(i).getCol()][list.get(i).getRow()].setBackgroundResource(R.color.colorPrimaryDark);
            }
        }
    }

    private boolean moverselec(ArrayList<Coordenadas> piece, Coordenadas coordinate) {
        Boolean permitido = false;
        for(int i =0;i<piece.size();i++){
            if(piece.get(i).getCol() == coordinate.getCol()  &&  piece.get(i).getRow() == coordinate.getRow()){
                permitido = true;
                break;
            }
        }
        return permitido;
    }

    private void resetColorAtultimaposicionition(Coordenadas ultimaposicion){
        if((ultimaposicion.getCol() + ultimaposicion.getRow())%2==0){
            fondodetablero[ultimaposicion.getCol()][ultimaposicion.getRow()].setBackgroundResource(R.color.colorPrimaryDark);
        }else {
            fondodetablero[ultimaposicion.getCol()][ultimaposicion.getRow()].setBackgroundResource(R.color.colorWhite);
        }
    }

    private void reypeligro(){
        ArrayList<Coordenadas> List = new ArrayList<>();

        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                if(tablero[i][j].getpieza() != null){
                    List.clear();
                    Coordenadas c = new Coordenadas(i,j);
                    List = tablero[i][j].getpieza().movperm(c,tablero);

                    for (int x=0;x<List.size();x++){
                        if(tablero[List.get(x).getCol()][List.get(x).getRow()].getpieza() instanceof general){

                            if((List.get(x).getCol()+List.get(x).getRow())%2==0){
                                fondodetablero[List.get(x).getCol()][List.get(x).getRow()].setBackgroundResource(R.color.colorPrimaryDark);
                            }else{
                                fondodetablero[List.get(x).getCol()][List.get(x).getRow()].setBackgroundResource(R.color.colorWhite);
                            }

                            if(tablero[i][j].getpieza().espieza() != tablero[List.get(x).getCol()][List.get(x).getRow()].getpieza().espieza()){
                                fondodetablero[List.get(x).getCol()][List.get(x).getRow()].setBackgroundResource(R.color.material_blue_grey_950);
                            }
                        }
                    }
                }
            }
        }


    }

    //
}