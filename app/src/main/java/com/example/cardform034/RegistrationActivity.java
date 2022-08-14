package com.example.cardform034;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegistrationActivity extends AppCompatActivity {

    EditText username, password, repassword;
    Button signup;
    LoginAuthDB DB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        username = findViewById(R.id.edittxtuserreg);
        password = findViewById(R.id.edittxtpassreg);
        repassword = findViewById(R.id.edittxtpassregrepeat);




        DB = new LoginAuthDB(this);


        findViewById(R.id.btnCancel).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegistrationActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });



        findViewById(R.id.btnRegAuthreg).setOnClickListener(v ->{
            String user = username.getText().toString();
            String pass = password.getText().toString();
            String repass = repassword.getText().toString();

            if(user.equals("")||pass.equals("")||repass.equals(""))
                Toast.makeText(RegistrationActivity.this, "Please enter all the fields", Toast.LENGTH_SHORT).show();
            else {
                if (pass.equals(repass)){
                    Boolean checkUser = DB.checkUsername(user);
                    if (checkUser==false){
                        Boolean insert = DB.insertData(user, pass);
                        if (insert == true){
                            Toast.makeText(RegistrationActivity.this, "Registered Successfully!", Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(getApplicationContext(), FormActivity.class);
                            startActivity(intent);
                        }
                        else {
                            Toast.makeText(RegistrationActivity.this, "Registered failed", Toast.LENGTH_SHORT).show();
                        }
                    }
                    else {
                        Toast.makeText(RegistrationActivity.this, "User already exists! Please login.", Toast.LENGTH_SHORT).show();
                    }
                }
                else {
                    Toast.makeText(RegistrationActivity.this, "Password not matching!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}