package com.example.dreamdive;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class cat5s2 extends AppCompatActivity {
    ImageButton s1;
    ImageButton s2;

    FloatingActionButton back1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat5s2);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.removedlogo);

        s1=findViewById(R.id.s1);
        s1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent=new Intent(cat5s2.this,option3.class);
                startActivity(intent);
            }
        });

        s2=findViewById(R.id.s2);
        s2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent=new Intent(cat5s2.this,option4.class);
                startActivity(intent);
            }
        });

        back1=findViewById(R.id.navgationn);
        back1.setOnClickListener(new View.OnClickListener() {

                                     @Override
                                     public void onClick(View v) {
                                         Intent intent = new Intent(cat5s2.this, cat5.class);
                                         startActivity(intent);
                                     }
                                 }


        ); }
}