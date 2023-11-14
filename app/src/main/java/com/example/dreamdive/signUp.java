package com.example.dreamdive;


import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class signUp extends AppCompatActivity {

    private EditText username,password,repassword;
    DB db;
    private Button btnSignUpn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.removedlogo);
        username=(EditText) findViewById(R.id.Username);
        password=(EditText) findViewById(R.id.Password);
        repassword=(EditText) findViewById(R.id.repassword);
        db =new DB(this);
        btnSignUpn=(Button) findViewById(R.id.buttonSignup);
        btnSignUpn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sign();
                String user=username.getText().toString();
                String pass=password.getText().toString();
                String repass=repassword.getText().toString();
                if(TextUtils.isEmpty(user) ||TextUtils.isEmpty(pass) ||TextUtils.isEmpty(repass))
                    Toast.makeText(signUp.this,"All fields ",Toast.LENGTH_LONG).show();
                else {
                    if (pass.equals(repass)) {
                        Boolean checkuser = db.checkusername(user);
                        if (checkuser == false) {
                            Boolean insert = db.insertData(user, pass);
                            if (insert == true) {
                                Toast.makeText(signUp.this, "Registered Successfull", Toast.LENGTH_LONG).show();
                                Intent intent = new Intent(getApplicationContext(), Login.class);
                                startActivity(intent);
                            } else {
                                Toast.makeText(signUp.this, "Registration Failed", Toast.LENGTH_LONG).show();}
                        } else {
                            Toast.makeText(signUp.this, "User already Exists", Toast.LENGTH_LONG).show();}
                    }else{
                        Toast.makeText(signUp.this,"Password are not matching",Toast.LENGTH_LONG).show();}
                }}});}
    public void sign(){
        Intent intent=new Intent(this,Login.class);
        startActivity(intent);
        finish();}}