package com.example.dreamdive;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.dreamdive.databinding.ActivityMainBinding;

    public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
        private static int Splash_Screen_TimeOut=2000;
        @Override
        protected void onCreate(Bundle savedInstanceState) {

            super.onCreate(savedInstanceState);
            binding=ActivityMainBinding.inflate(getLayoutInflater());

            setContentView(binding.getRoot());
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setIcon(R.drawable.removedlogo);
            replaceFragment(new HomeFregment());
            binding.bottomNavView.setBackground(null);

            binding.bottomNavView.setOnItemSelectedListener(item -> {

                switch(item.getItemId()){
                    case R.id.home:
                        replaceFragment(new HomeFregment());
                        break;
                    case R.id.aboutUs:
                        replaceFragment(new aboutUsFragment());
                        break;
                    case R.id.contactUs:
                        replaceFragment(new contactUsFragment());
                        break;
                    case R.id.profile:
                        replaceFragment(new profile());
                        break;
                }
                return true;
            });


        }
        private void replaceFragment(Fragment fragment){
            FragmentManager fragmentManager=getSupportFragmentManager();
            FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();;
            fragmentTransaction.replace(R.id.frame_layout,fragment);
            fragmentTransaction.commit();

        }
}