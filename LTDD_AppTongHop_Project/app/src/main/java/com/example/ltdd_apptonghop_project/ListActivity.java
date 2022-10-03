package com.example.ltdd_apptonghop_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import java.util.ArrayList;


public class ListActivity extends AppCompatActivity {
    ListView lvLapTop;
    ArrayList<LapTop> arrayLapTop;
    LapTopAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        Button btnBack = (Button) findViewById(R.id.btnBack3);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent HomeScreen = new Intent(ListActivity.this,HomeActivity.class);
                startActivity(HomeScreen);
            }
        });

        AnhXa();

        adapter = new LapTopAdapter(this,R.layout.activity_listitem,arrayLapTop);
        lvLapTop.setAdapter(adapter);
    }
    private void AnhXa() {
        lvLapTop = (ListView) findViewById(R.id.listView);
        arrayLapTop = new ArrayList<>();

        arrayLapTop.add(new LapTop("Laptop Gaming MSI Vector GP76 12UGS 610VN",R.drawable.laptop1,"57990000","48990000"));
        arrayLapTop.add(new LapTop("Laptop Gaming Acer Predator Helios 300 PH315 55 76KG",R.drawable.laptop2,"46990000","40990000"));
        arrayLapTop.add(new LapTop("Laptop Gaming Asus ROG Flow Z13 GZ301ZC LD110W",R.drawable.laptop3,"49990000","44990000"));
        arrayLapTop.add(new LapTop("Laptop Gaming Dell Alienware M15 R6 P109F001DBL",R.drawable.laptop4,"61990000","47990000"));
        arrayLapTop.add(new LapTop("Laptop Gaming Lenovo Legion 5 15ARH7H 82RD003TVN",R.drawable.laptop5,"47990000","41990000"));
    }

}
