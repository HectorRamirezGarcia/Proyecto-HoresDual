package com.example.ajedrezchino;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menusito extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menusito);

        final Button a = findViewById(R.id.btn_Start);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menusito.this,nombre.class);
                startActivity(intent);
            }
        });

        final Button b = findViewById(R.id.btn_Help);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menusito.this,Help.class);
                startActivity(intent);
            }
        });

        final Button c = findViewById(R.id.btn_About_us);
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menusito.this,About_us.class);
                startActivity(intent);
            }
        });

    }
}
