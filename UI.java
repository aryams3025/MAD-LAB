package com.example.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText nam,em,ph,pass;
    private RadioButton mal,fem;
    private Button reg;
    String n,e,p,pa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nam = (EditText) findViewById(R.id.name);
        em = (EditText) findViewById(R.id.email);
        ph = (EditText) findViewById(R.id.phone);
        pass = (EditText) findViewById(R.id.password);
        mal = (RadioButton) findViewById(R.id.male);
        fem = (RadioButton) findViewById(R.id.female);
        reg = (Button) findViewById(R.id.register);

        reg.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View view) {
                                       n=nam.getText().toString().trim();
                                       e=em.getText().toString().trim();
                                       p=ph.getText().toString().trim();
                                       pa=pass.getText().toString().trim();
                                       if(nam.equals("")){
                                           Toast.makeText(MainActivity.this,"Enter your Name", Toast.LENGTH_SHORT).show();
                                       }
                                       else if(em.equals("")){
                                           Toast.makeText(MainActivity.this,"Enter your Email id", Toast.LENGTH_SHORT).show();
                                       }
                                       else if(ph.equals("")){
                                           Toast.makeText(MainActivity.this,"Enter your Phone number", Toast.LENGTH_SHORT).show();
                                       }
                                       else if(pass.equals("")){
                                           Toast.makeText(MainActivity.this,"Enter your Password", Toast.LENGTH_SHORT).show();
                                       }
                                       else{
                                           Toast.makeText(MainActivity.this,"Registration Successful", Toast.LENGTH_SHORT).show();
                                       }
                                   }
                               }
        );


    }
