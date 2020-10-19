package com.example.ajedrezchino;

import com.example.ajedrezchino.piezas.Pieza;

public class posicion {
    private Pieza pieza;

    posicion(Pieza pieza ) {
            this.pieza = pieza;
        }
        public Pieza getpieza() {
            return pieza;

        }

        void setpieza(Pieza pieza) {
            this.pieza = pieza;
        }
}

