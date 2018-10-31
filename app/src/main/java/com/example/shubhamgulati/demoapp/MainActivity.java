package com.example.shubhamgulati.demoapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.provider.Settings;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etName,etEmail,etPass;
    Button btnSign;
    Animation animation;
//    AlertDialog alertDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etName=findViewById(R.id.etName);
        etEmail=findViewById(R.id.etEmail);
        etPass=findViewById(R.id.etPass);
        animation= AnimationUtils.loadAnimation(this,R.anim.move);
        btnSign=findViewById(R.id.btnSign);
        btnSign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=etName.getText().toString();
                String email=etEmail.getText().toString();
                String pass=etPass.getText().toString();
                Toast.makeText(MainActivity.this,"Hello "+name,Toast.LENGTH_SHORT).show();
                Intent i = new Intent(MainActivity.this,VpActivity.class);
                i.putExtra("name",name);
                startActivity(i);
                btnSign.startAnimation(animation);
            }
        });


    }


}
