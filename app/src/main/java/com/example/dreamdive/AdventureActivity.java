package com.example.dreamdive;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
public class AdventureActivity extends AppCompatActivity {
ImageButton s1;ImageButton s2;ImageButton s3;ImageButton s4;
FloatingActionButton back1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adventure);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.removedlogo);
        //--------------------s1-------------------------------//
        s1=findViewById(R.id.thetroobles);
        s1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AdventureActivity.this,theTrooblesSTORY.class);
                    startActivity(intent);
            }
        });
        //--------------------s2-------------------------------//
        s2=findViewById(R.id.s2);
        s2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AdventureActivity.this,Cat1S2.class);
                startActivity(intent);
            }
        });
        //--------------------s3-------------------------------//
        s3=findViewById(R.id.s3);
        s3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AdventureActivity.this,Cat1S3.class);
                startActivity(intent);
            }
        });
        //--------------------s4-------------------------------//
        s4=findViewById(R.id.s4);
        s4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AdventureActivity.this,Cat1S4.class);
                startActivity(intent);
            }
        });
        //------------------------back-------------------------//
        back1=findViewById(R.id.navgationn);
        back1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AdventureActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}