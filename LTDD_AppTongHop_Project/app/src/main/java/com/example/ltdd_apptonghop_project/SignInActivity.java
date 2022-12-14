package com.example.ltdd_apptonghop_project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SignInActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        TextView email = findViewById(R.id.txtEmail);
        TextView password = findViewById(R.id.txtPassword);

        Button btnLogin = (Button) findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(email.getText().toString().equals("duy") && password.getText().toString().equals("123")){
                    Toast.makeText(SignInActivity.this,"Login successful",Toast.LENGTH_SHORT).show();
                    Intent HomeScreen = new Intent(SignInActivity.this,HomeActivity.class);
                    startActivity(HomeScreen);
                }else
                    Toast.makeText(SignInActivity.this,"Login failed",Toast.LENGTH_SHORT).show();
            }
        });
        Button btnSignup = (Button) findViewById(R.id.btnSignup);
        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent SignUpScreen = new Intent(SignInActivity.this,SignUpActivity.class);
                startActivity(SignUpScreen);
            }
        });
    }
}
