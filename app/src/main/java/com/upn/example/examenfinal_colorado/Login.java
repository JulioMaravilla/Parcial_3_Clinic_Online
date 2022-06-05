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

public class Login extends AppCompatActivity {

    EditText username , password;
    TextView signin;
    DBHelper DB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = findViewById(R.id.username1);
        password =findViewById(R.id.password1);
        signin = findViewById(R.id.signin1);
        DB = new DBHelper(this);

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = username.getText().toString();
                String pass = password.getText().toString();

                if(TextUtils.isEmpty(user) || TextUtils.isEmpty(pass))
                    Toast.makeText(Login.this,"Llena todos los campos",Toast.LENGTH_SHORT).show();
                else{
                    Boolean checkuserpass = DB.checkusernamepassword(user,pass);
                    if(checkuserpass==true){
                        Toast.makeText(Login.this,"Bienvenido, inicio de sesion exitoso",Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(getApplicationContext(),menulateral.class);
                        startActivity(intent);
                    }else{
                        Toast.makeText(Login.this,"Inicia de sesion fallido, intentalo de nuevo",Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}