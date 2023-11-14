package com.example.dreamdive;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class HistoricalActivity extends AppCompatActivity {

    ImageButton s1;
    ImageButton s2;


    FloatingActionButton back1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historical);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.removedlogo);
        //--------------------s1-------------------------------//
        s1=findViewById(R.id.s1);
        s1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HistoricalActivity.this,Cat3S1.class);
                startActivity(intent);
            }
        });
        //--------------------s2-------------------------------//
        s2=findViewById(R.id.s2);
        s2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HistoricalActivity.this,Cat3S2.class);
                startActivity(intent);
            }
        });


        //------------------------back-------------------------//
        back1=findViewById(R.id.navgationn);
        back1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HistoricalActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}