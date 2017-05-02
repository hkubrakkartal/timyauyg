package com.example.admin.tim;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Etkinlikler extends AppCompatActivity implements View.OnClickListener{
    Button btn1;
    Button btn2;
    Button btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_etkinlikler);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        btn1=(Button)findViewById(R.id.button1);
        btn1.setOnClickListener(this);
        btn2=(Button)findViewById(R.id.button2);
        btn2.setOnClickListener(this);
        btn3=(Button)findViewById(R.id.button3);
        btn3.setOnClickListener(this);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.button1:
                Intent intent=new Intent(Etkinlikler.this, Etkinlik_icerik.class);
                startActivity(intent);
                break;
            case R.id.button2:
                Intent intent2=new Intent(Etkinlikler.this, Etkinlik_icerik2.class);
                startActivity(intent2);
                break;
            case R.id.button3:
                Intent intent3=new Intent(Etkinlikler.this, Etkinlik_icerik3.class);
                startActivity(intent3);
                break;

        }
    }
}
