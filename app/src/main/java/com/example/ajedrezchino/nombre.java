package com.example.ajedrezchino;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class nombre extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nombre);

        final EditText name = findViewById(R.id.TxtNombre);
        final EditText name2 = findViewById(R.id.TxtNombre2);

        final Button a = findViewById(R.id.btnEnviar);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Jugador1 = name.getText().toString();
                String Jugador2 = name2.getText().toString();
                Intent intent = new Intent(nombre.this,MainActivity.class);
                intent.putExtra("JUGADOR1", Jugador1);
                intent.putExtra("JUGADOR2", Jugador2);
                startActivity(intent);
            }
        });
    }
}