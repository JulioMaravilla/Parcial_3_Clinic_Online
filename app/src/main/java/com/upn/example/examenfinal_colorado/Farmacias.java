package com.upn.example.examenfinal_colorado;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Farmacias extends AppCompatActivity {
    Button labuena, rey, sanfran;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_farmacias);
        asignarubicaciones();
    }

    private void asignarubicaciones() {
        labuena = findViewById(R.id.btnlabuena);
        labuena.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Farmacias.this, Mapas.class);
                intent.putExtra("latitud", "13.345457538271754");
                intent.putExtra("longitud", "-88.44281120327929");
                intent.putExtra("titulo", "Farmacia la buena");
                startActivity(intent);

            }
        });
        rey = findViewById(R.id.btnrey);
        rey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Farmacias.this, Mapas.class);
                intent.putExtra("latitud", "13.342270161685283");
                intent.putExtra("longitud", "-88.42875391677264");
                intent.putExtra("titulo", "Farmacia San Rey");
                startActivity(intent);

            }
        });
        sanfran = findViewById(R.id.btnsanfran);
        sanfran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Farmacias.this, Mapas.class);
                intent.putExtra("latitud", "13.695768132150338");
                intent.putExtra("longitud", "-88.78567071791639");
                intent.putExtra("titulo", "Farmacia San Francisco");
                startActivity(intent);


            }
        });
    }

}