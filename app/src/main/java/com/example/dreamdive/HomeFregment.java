package com.example.dreamdive;

import static androidx.databinding.DataBindingUtil.setContentView;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

public class HomeFregment extends Fragment {
    public static String username;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_home_fregment, container, false);
        TextView tvview= (TextView) view.findViewById(R.id.idoftheuser);
        String result=Login.username.getText().toString();
        tvview.setText(result);
        ImageButton btn1 = (ImageButton)  view.findViewById(R.id.adventureActiv);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(getActivity(),AdventureActivity.class);
                in.putExtra("some","some data");
                startActivity(in);
            }
        });
        //////////////////////////////////// ////////////////////////////////////
        ImageButton btn3 = (ImageButton)  view.findViewById(R.id.fairytaleActiv);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(getActivity(),FairytaleActivity.class);
                in.putExtra("some","some data");
                startActivity(in);
            }
        });

        ImageButton btn2 = (ImageButton)  view.findViewById(R.id.historicalActiv);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(getActivity(),HistoricalActivity.class);
                in.putExtra("some","some data");
                startActivity(in);
            }
        });
        //////////////////////////////////// ////////////////////////////////////


        //////////////////////////////////// ////////////////////////////////////

        ImageButton btn4 = (ImageButton)  view.findViewById(R.id.mestryActiv);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(getActivity(),MysteryActivity.class);
                in.putExtra("some","some data");
                startActivity(in);
            }
        });
        //////////////////////////////////// ////////////////////////////////////
        ImageButton btn5 = (ImageButton)  view.findViewById(R.id.cat5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(getActivity(),cat5.class);
                in.putExtra("some","some data");
                startActivity(in);
            }
        });
        return view;
    }


}

