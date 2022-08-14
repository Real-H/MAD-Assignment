package com.example.cardform034;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText username, password;
    Button btnLogin;
    LoginAuthDB DB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_acivity);

        username = findViewById(R.id.edittxtuserlogin);
        password = findViewById(R.id.edittxtpasslogin);

        btnLogin = findViewById(R.id.btnlogin);
        DB = new LoginAuthDB(this);
        findViewById(R.id.btnRegAuthlogin).setOnClickListener(v ->{
            Intent intent = new Intent(LoginActivity.this, RegistrationActivity.class);
            startActivity(intent);
        });
        findViewById(R.id.btnlogin).setOnClickListener(v ->{
            String user = username.getText().toString();
            String pass = password.getText().toString();

            if (user.equals("")||pass.equals("")){
                Toast.makeText(LoginActivity.this, "Please enter all fields!", Toast.LENGTH_SHORT).show();
            }
            else {
                Boolean checkUserPass = DB.checkUsernamePassword(user, pass);
                if (checkUserPass==true){
                    Toast.makeText(LoginActivity.this, "Login Successfully!!!", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(), FormActivity.class);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(LoginActivity.this, "Invalid Credentials!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}