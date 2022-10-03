package com.example.ltdd_apptonghop_project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button btnList = (Button) findViewById(R.id.btnList);
        Button btnProfile = (Button) findViewById(R.id.btnProfile);

        btnList.setOnClickListener(new View.OnClickListener(){
        public void onClick(View v){
                Intent ListScreen = new Intent(HomeActivity.this,ListActivity.class);
                startActivity(ListScreen);
        }
    });
        btnProfile.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent ProfileScreen = new Intent(HomeActivity.this,ProfileActivity.class);
                startActivity(ProfileScreen);
            }
        });
        Button btnBack = (Button) findViewById(R.id.btnBack3);
        btnBack.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent SignInScreen = new Intent(HomeActivity.this,SignInActivity.class);
                startActivity(SignInScreen);
            }
        });
}
}
