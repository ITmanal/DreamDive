package com.example.dreamdive;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class theTrooblesSTORY extends AppCompatActivity {
Button back;
FloatingActionButton back1;
MediaPlayer audio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_troobles_story);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.removedlogo);
            audio=MediaPlayer.create(theTrooblesSTORY.this,R.raw.troubles);

        back1=findViewById(R.id.navgationn);
        back1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent=new Intent(theTrooblesSTORY.this,AdventureActivity.class);
                startActivity(intent);

            }

        });
    }
    public void playit (View v) {
        audio.start();
    }
    @Override
    public void onPause () {
    super.onPause();
    audio.release();
    }
    }


