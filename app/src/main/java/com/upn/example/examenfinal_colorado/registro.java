package com.upn.example.examenfinal_colorado;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class registro extends AppCompatActivity {

    EditText username,password,repassword;
    TextView signup,signin;
    DBHelper DB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        username = findViewById(R.id.username);
        password = findViewById(R.id.Password);
        repassword = findViewById(R.id.rePassword);
        signup = findViewById(R.id.signup);
        signin = findViewById(R.id.signin);
        DB = new DBHelper(this);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user=username.getText().toString();
                String pass=password.getText().toString();
                String repass=repassword.getText().toString();

                if(TextUtils.isEmpty(user) || TextUtils.isEmpty(pass) || TextUtils.isEmpty(repass))
                    Toast.makeText(registro.this, "Llena todos los campos", Toast.LENGTH_SHORT).show();
                else{
                    if(pass.equals(repass)){
                        Boolean checkuser =DB.checkusername(user);
                        if(checkuser==false)
                        {
                            Boolean insert = DB.insertData(user,pass);
                            if(insert==true){
                                Toast.makeText(registro.this, "Registrado exitosamente", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(getApplicationContext(), menulateral.class);
                                startActivity(intent);
                            }else{
                                Toast.makeText(registro.this, "Error al registrarte", Toast.LENGTH_SHORT).show();
                            }
                        }else{
                            Toast.makeText(registro.this, "Este Usuario ya existe, intenta con otro", Toast.LENGTH_SHORT).show();
                        }
                    } else{
                        Toast.makeText(registro.this, "Error! Las contraseñas no coinciden", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(registro.this,Login.class);
                startActivity(intent);
            }
        });
    }
}