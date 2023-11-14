package com.example.dreamdive;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {
    private Button btnLogin;
    private TextView SignUp;
    public static EditText username,password;
    private DB db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.removedlogo);
        username=(EditText) findViewById(R.id.Username1);
        password=(EditText) findViewById(R.id.Password1);
        db=new DB(this);
        SignUp=(TextView) findViewById(R.id.SinUp);
        SignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signUp();
            }
        });
        btnLogin=(Button) findViewById(R.id.buttonLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user=username.getText().toString();
                String pass=password.getText().toString();

                if(TextUtils.isEmpty(user) ||TextUtils.isEmpty(pass))
                    Toast.makeText(Login.this,"All fields ",Toast.LENGTH_LONG).show();
                else {
                    Boolean checkuserpass = db.checkusernamepassword(user,pass);
                    if(checkuserpass==false){
                        Toast.makeText(Login.this,"Login Successfull",Toast.LENGTH_LONG).show();
                        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(intent);
                    }else {
                        Toast.makeText(Login.this,"Login Failed",Toast.LENGTH_LONG).show();}}}});}
    public void signUp(){
        Intent intent=new Intent(this,signUp.class);
        startActivity(intent);
        finish();}}