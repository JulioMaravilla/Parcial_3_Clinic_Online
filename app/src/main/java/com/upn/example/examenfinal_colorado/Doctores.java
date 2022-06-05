package com.upn.example.examenfinal_colorado;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Doctores extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctores);
        Button pedro=(Button) findViewById(R.id.Dr_Pedro);
        pedro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pedro = new Intent(Doctores.this,Dr_pedro.class);
                startActivity(pedro);
            }
        });
        Button edwin=(Button) findViewById(R.id.Dr_Edwin);
        edwin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent edwin = new Intent(Doctores.this,Dr_edwin.class);
                startActivity(edwin);
            }
        });
        Button sergio=(Button) findViewById(R.id.Dr_Sergio);
        sergio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sergio = new Intent(Doctores.this,Dr_sergio.class);
                startActivity(sergio);
            }
        });

    }
}