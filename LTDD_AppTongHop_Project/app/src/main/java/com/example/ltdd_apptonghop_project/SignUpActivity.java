package com.example.ltdd_apptonghop_project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SignUpActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        Button btnBack = (Button) findViewById(R.id.btnBack1);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent SignInScreen = new Intent(SignUpActivity.this,SignInActivity.class);
                startActivity(SignInScreen);
            }
        });
    }
}
